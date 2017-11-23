package br.com.caio.utils;

import javax.persistence.EntityManager;

import br.com.caio.modelo.Passageiro;

public class main {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		Passageiro p = new Passageiro();
		p.setCpf("23213123123");
		p.setNome("Matheus");
		em.getTransaction().begin();
		
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		
		if(em.isOpen()){
			System.out.println("Aberta");
		}

	}

}
