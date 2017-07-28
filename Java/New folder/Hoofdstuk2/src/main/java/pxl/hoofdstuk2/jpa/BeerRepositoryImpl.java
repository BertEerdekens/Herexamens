package pxl.hoofdstuk2.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository("beerRepository")
public class BeerRepositoryImpl implements BeerRepository{

	private EntityManagerFactory emf;
	
	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public Beer getBeerById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Beer beer = em.find(Beer.class, id);
		tx.commit();
		em.clear();
		return beer;
	}
}
