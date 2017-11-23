package br.com.caio.servico;

import java.util.List;

import br.com.caio.dao.CorridaDAO;
import br.com.caio.dao.MotoristaDAO;
import br.com.caio.modelo.Corrida;
import br.com.caio.modelo.Motorista;
import br.com.caio.modelo.Passageiro;

public class CorridaServico {
	
	CorridaDAO corridaDAO = new CorridaDAO();

	public void adiciona(Corrida corrida) {
		corridaDAO.adiciona(corrida);
	}

	public List<Corrida> lista() {
		return corridaDAO.lista();
	}

	public Corrida buscaPorId(int id) {
		return corridaDAO.findByid(id);
	}

	public void excluir(int id) {
		corridaDAO.excluir(id);
	}

	public void editar(Corrida c) {
		corridaDAO.editar(c);
	}
	
	public List<Motorista> listaMotorista() {
		return corridaDAO.listaMotorista();
	}
	
	public List<Passageiro> listaPassageiro() {
		return corridaDAO.listaPassageiro();
	}
	
}
