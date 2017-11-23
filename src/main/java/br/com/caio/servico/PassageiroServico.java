package br.com.caio.servico;

import java.util.List;
import br.com.caio.dao.PassageiroDAO;
import br.com.caio.modelo.Passageiro;

public class PassageiroServico {

	PassageiroDAO passageiroDAO = new PassageiroDAO();

	public void adiciona(Passageiro passageiro) {
		passageiroDAO.adiciona(passageiro);
	}

	public List<Passageiro> lista() {
		return passageiroDAO.lista();
	}

	public Passageiro buscaPorId(int id) {
		return passageiroDAO.findByid(id);
	}

	public void excluir(int id) {
		passageiroDAO.excluir(id);
	}

	public void editar(Passageiro p) {
		passageiroDAO.editar(p);
	}

}
