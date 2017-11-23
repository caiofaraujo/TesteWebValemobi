package br.com.caio.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("corridas");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
