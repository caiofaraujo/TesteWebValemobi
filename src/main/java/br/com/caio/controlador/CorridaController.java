package br.com.caio.controlador;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caio.modelo.Corrida;
import br.com.caio.modelo.Motorista;
import br.com.caio.servico.CorridaServico;
import br.com.caio.utils.ValidarCorrida;
import br.com.caio.utils.ValidarMotorista;

@Controller
public class CorridaController {
	private CorridaServico servico = new CorridaServico();
	private final Result result;
	private final Validator validator;
	
	@Inject
	public CorridaController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}
	
	@Deprecated
	public CorridaController() {
		this(null, null);
	}
	
	@Path("/corrida/novo")
	public void novo() {
		result.include("passageiros", this.servico.listaPassageiro()).include("motoristas", this.servico.listaMotorista());
	}
	
	@Path("/corrida/adiciona")
	@Post
	public void adiciona(Corrida corrida) {
		// Validação de mensagem 
		String mensagem;
		ValidarCorrida validar = new ValidarCorrida();
		mensagem = validar.validarCorrida(corrida);
		if (mensagem != null) {
			validator.add(new SimpleMessage("corrida.valor", mensagem));
			validator.onErrorForwardTo(this).novo();
			//				result.redirectTo(this).novo();
		} else {
			servico.adiciona(corrida);
			result.redirectTo(this).lista();
		}
	}
	
	public void lista() {
		result.include("corridas", servico.lista());
	}
	
	public void listaMotorista () {
		result.include("motoristas", servico.listaMotorista());
	}
	
	public void listaPassageiros() {
		result.include("passageiros", servico.listaPassageiro());
	}
	
	public void excluir(int id) {
		try {
			servico.excluir(id);
			result.redirectTo(this).lista();
		} catch (Exception e) {
			System.out.println("Erro!");
		}
	}
	
	public void edita(int id) {
		Corrida corrida = servico.buscaPorId(id);
		result.include("corrida", corrida);
	}
	
	public void editar(int id) {
		try {
			Corrida corrida = servico.buscaPorId(id);
			servico.editar(corrida);
			result.redirectTo(this).lista();
		} catch (Exception e) {
			System.out.println("Erro!");
		}
	}
	
}
