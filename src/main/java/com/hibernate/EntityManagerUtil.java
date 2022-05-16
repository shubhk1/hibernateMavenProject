package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	// same name should be inside persistence.xml
	public static final String PERSISTENCE_UNIT_NAME = "jpa-persist";    //same name should be in persistence.xml

	private static EntityManager entityManager;

	private EntityManagerUtil() {

	}

	public static EntityManager getEntityManager() {
		if (entityManager == null) {

			EntityManagerFactory emfactory = Persistence
					.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			return emfactory.createEntityManager();
		}

		return entityManager;
	}

}
