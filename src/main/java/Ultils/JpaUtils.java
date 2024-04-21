package Ultils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	
	private static  EntityManagerFactory em;
	public static EntityManager getEntityManager () {
		if (em == null || em.isOpen() )
		em = Persistence.createEntityManagerFactory("asmjava4");
		return em.createEntityManager();
	}
}
