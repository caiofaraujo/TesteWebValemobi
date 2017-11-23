package br.com.caio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caio.modelo.Motorista;
import br.com.caio.utils.JPAUtil;

public class MotoristaDAO {


	public void adiciona(Motorista motorista) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(motorista);
		em.getTransaction().commit();
		em.close();
	}

	public List<Motorista> lista() {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Motorista> motoristas = em.createQuery("FROM Motorista").getResultList();
		em.close();
		return motoristas;
	}

	public Motorista findByid(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		Motorista m = em.find(Motorista.class, id);
		em.close();
		return m;
	}

	public void excluir(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Motorista m = em.find(Motorista.class, id);
		em.remove(m);
		em.getTransaction().commit();
		em.close();
	}
	
	

	public void editar(Motorista m) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin(); 
		em.merge(m);
		em.getTransaction().commit();
		em.close();
	}

}
