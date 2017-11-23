package br.com.caio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import br.com.caio.modelo.Passageiro;
import br.com.caio.utils.JPAUtil;

public class PassageiroDAO {

	public void adiciona(Passageiro passageiro) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(passageiro);
		em.getTransaction().commit();
		em.close();
	}

	public List<Passageiro> lista() {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Passageiro> passageiros = em.createQuery("FROM Passageiro").getResultList();
		em.close();
		return passageiros;
	}

	public Passageiro findByid(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		Passageiro p = em.find(Passageiro.class, id);
		em.close();
		return p;
	}

	public void excluir(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Passageiro p = em.find(Passageiro.class, id);
		em.remove(p);
		em.getTransaction().commit();
		em.close();
	}

	public void editar(Passageiro p) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin(); 
		em.merge(p);
		em.getTransaction().commit();
		em.close();
	}
}
