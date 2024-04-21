package Dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;

import Ultils.JpaUtils;

public class AbstractDao<T> {

	public T findById(Class<T> clazz, Integer id) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			return entityManager.find(clazz, id);
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();
		}
	}

	public List<T> findAll(Class<T> clazz, boolean existIsActive) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			String entityName = clazz.getSimpleName();
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT o FROM ").append(entityName).append(" o");
			if (existIsActive == true) {
				sql.append(" WHERE isActive = 1");
			}
			TypedQuery<T> query = entityManager.createQuery(sql.toString(), clazz);
			return query.getResultList();
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();
		}
	}

	public List<T> findUserAll(Class<T> clazz, boolean existIsActive, int pageNumber, int pageSize) {
	    EntityManager entityManager = JpaUtils.getEntityManager();
	    try {
	        String entityName = clazz.getSimpleName();
	        String jpql = "SELECT o FROM " + entityName + " o";
	

	        TypedQuery<T> query = entityManager.createQuery(jpql, clazz);
	        query.setFirstResult((pageNumber - 1) * pageSize);
	        query.setMaxResults(pageSize);

	        return query.getResultList();
	    } finally {
	        entityManager.close();
	    }
	}
	
	public List<T> findAll(Class<T> clazz, boolean existIsActive, int pageNumber, int pageSize) {
	    EntityManager entityManager = JpaUtils.getEntityManager();
	    try {
	        String entityName = clazz.getSimpleName();
	        String jpql = "SELECT o FROM " + entityName + " o";
	        if (existIsActive) {
	            jpql += " WHERE o.isActive = true";
	        }

	        TypedQuery<T> query = entityManager.createQuery(jpql, clazz);
	        query.setFirstResult((pageNumber - 1) * pageSize);
	        query.setMaxResults(pageSize);

	        return query.getResultList();
	    } finally {
	        entityManager.close();
	    }
	}

	public T findOne(Class<T> clazz, String sql, Object... params) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			TypedQuery<T> query = entityManager.createQuery(sql, clazz);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			List<T> result = query.getResultList();
			if (result.isEmpty()) {
				return null;
			}
			return result.get(0);
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();
		}
	}

	public List<T> findMary(Class<T> clazz, String sql, Object... params) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			TypedQuery<T> query = entityManager.createQuery(sql, clazz);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			return query.getResultList();
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();
		}

	}
	
	public List<T> findMarySize(Class<T> clazz, String sql,int pageNumber,int pageSize, Object... params) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			TypedQuery<T> query = entityManager.createQuery(sql, clazz);
			query.setFirstResult((pageNumber - 1) * pageSize);
			query.setMaxResults(pageSize);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			return query.getResultList();
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();
		}

	}
	

	@SuppressWarnings("unchecked")
	public List<Object[]> findMaryByNativeQuery(Class<T> clazz, String sql, Object... params) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			Query query = entityManager.createQuery(sql, clazz);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			return query.getResultList();
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();
		}
	}

	public T create(T entity) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			System.out.println("Create succeed");
			return entity;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Cannot insert entity" + entity.getClass().getSimpleName() + "to DB");
			throw new RuntimeException(e);
		} finally {
			entityManager.close();
		}
	}

	public T update(T entity) {
		EntityManager entityManager = JpaUtils.getEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(entity);
			entityManager.getTransaction().commit();
			System.out.println("Update succeed");
			return entity;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Cannot update entity" + entity.getClass().getSimpleName());
			throw new RuntimeException(e);
		} finally {
			entityManager.close();
		}
	}
		public void delete(int id, Class<T> clazz) {
			EntityManager entityManager = JpaUtils.getEntityManager();
			try {
				entityManager.getTransaction().begin();
				System.out.println("ok");
				entityManager.remove(entityManager.find(clazz, id));
				entityManager.getTransaction().commit();
				System.out.println("Delete succeed");
			} catch (Exception e) {
				entityManager.getTransaction().rollback();
				System.out.println("Cannot delete entity");
				throw new RuntimeException(e);
			} finally {
				entityManager.close();
			}
	}
		
		public void Exeute(Class<T> clazz, String sql, Object... params) {
			EntityManager entityManager = JpaUtils.getEntityManager();
			try {
				entityManager.getTransaction().begin();
				Query query = entityManager.createNativeQuery(sql);
				for (int i = 0; i < params.length; i++) {
					query.setParameter(i, params[i]);
				}
				query.executeUpdate();
				entityManager.getTransaction().commit();
		
				
			} catch (Exception e) {
				e.printStackTrace();
				entityManager.getTransaction().rollback();
			} finally {
				entityManager.close();
			}
		}
}
