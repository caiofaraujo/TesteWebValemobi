package br.com.caio.servico;

import java.util.List;

import br.com.caio.dao.MotoristaDAO;
import br.com.caio.modelo.Motorista;

public class MotoristaServico {


	MotoristaDAO motoristaDAO = new MotoristaDAO();

	public void adiciona(Motorista motorista) {
		motoristaDAO.adiciona(motorista);
	}

	public List<Motorista> lista() {
		return motoristaDAO.lista();
	}

	public Motorista buscaPorId(int id) {
		return motoristaDAO.findByid(id);
	}

	public void excluir(int id) {
		motoristaDAO.excluir(id);
	}

	public void editar(Motorista m) {
		motoristaDAO.editar(m);
	}


}
