package br.com.caio.controlador;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.jsp.tagext.ValidationMessage;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Message;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caio.modelo.Passageiro;
import br.com.caio.servico.PassageiroServico;
import br.com.caio.utils.JPAUtil;
import br.com.caio.utils.ValidarPassageiro;

@Controller
public class PassageiroController {

	private PassageiroServico servico = new PassageiroServico();
	private final Result result;
	private final Validator validator;
	
	@Inject
	public PassageiroController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}

	@Deprecated
	public PassageiroController() {
		this(null, null);
	}

	@Path("/passageiro/novo")
	public void novo() {
		System.out.println("Meu sistema com vraptor");
	}

	@Path("/passageiro/adiciona")
	@Post
	public void adiciona(Passageiro passageiro) {

			
			// Validação de mensagem 
			String mensagem;
			ValidarPassageiro validar = new ValidarPassageiro();
			mensagem = validar.validarPassageiro(passageiro);
			if (mensagem != null) {
				validator.add(new SimpleMessage("passageiro.nome", mensagem));
				validator.onErrorForwardTo(this).novo();
//				result.redirectTo(this).novo();
			} else {
				servico.adiciona(passageiro);
				result.redirectTo(this).lista();
			}
			
	}

	public void lista() {
		result.include("passageiros", servico.lista());
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
		Passageiro passageiro = servico.buscaPorId(id);
		result.include("passageiro", passageiro);
	}

	public void editar(Passageiro p) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin(); 
		em.merge(p);
		em.getTransaction().commit();
		em.close();
	}
}
