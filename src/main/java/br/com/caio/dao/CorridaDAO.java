package br.com.caio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caio.modelo.Corrida;
import br.com.caio.modelo.Motorista;
import br.com.caio.modelo.Passageiro;
import br.com.caio.utils.JPAUtil;

public class CorridaDAO {
	
	public void adiciona(Corrida corrida) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(corrida);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Corrida> lista() {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Corrida> corridas = em.createQuery("FROM motorista_corrida").getResultList();
		em.close();
		return corridas;
	}
	
	public Corrida findByid(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		Corrida c = em.find(Corrida.class, id);
		em.close();
		return c;
	}
	
	public void excluir(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Corrida c = em.find(Corrida.class, id);
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}
	
	public void editar(Corrida c) {
		EntityManager em = new JPAUtil().getEntityManager();
		Corrida cr = em.find(Corrida.class, c.getId());
		em.getTransaction().begin();		
		cr = c;
		em.merge(cr);
		em.getTransaction().commit();
		em.close();
	}
	
	
	
	public List<Motorista> listaMotorista() {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Motorista> motoristas = em.createQuery("FROM Motorista").getResultList();
		em.close();
		return motoristas;
	}
	
	public List<Passageiro> listaPassageiro() {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Passageiro> passageiros = em.createQuery("FROM Passageiro").getResultList();
		em.close();
		return passageiros;
	}
	
}
