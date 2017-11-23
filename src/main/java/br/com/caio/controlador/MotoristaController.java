package br.com.caio.controlador;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caio.modelo.Motorista;
import br.com.caio.servico.MotoristaServico;
import br.com.caio.utils.JPAUtil;
import br.com.caio.utils.ValidarMotorista;

@Controller
public class MotoristaController {


	private MotoristaServico servico = new MotoristaServico();
	private final Result result;
	private final Validator validator;

	@Inject
	public MotoristaController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}

	@Deprecated
	public MotoristaController() {
		this(null, null);
	}

	@Path("/motorista/novo")
	public void novo() {
		System.out.println("Meu sistema com vraptor");
	}

	@Path("/motorista/adiciona")
	@Post
	public void adiciona(Motorista motorista) {
		// Validação de mensagem 
		String mensagem;
		ValidarMotorista validar = new ValidarMotorista();
		mensagem = validar.validarMotorista(motorista);
		if (mensagem != null) {
			validator.add(new SimpleMessage("motorista.nome", mensagem));
			validator.onErrorForwardTo(this).novo();
			//				result.redirectTo(this).novo();
		} else {
			servico.adiciona(motorista);
			result.redirectTo(this).lista();
		}

	}

	public void lista() {
		result.include("motoristas", servico.lista());
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
		Motorista motorista = servico.buscaPorId(id);
		result.include("motorista", motorista);
	}

	
	public void editar(Motorista motorista) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin(); 
		em.merge(motorista);
		em.getTransaction().commit();
		em.close();
	}

}
