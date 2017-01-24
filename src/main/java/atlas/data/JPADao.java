package atlas.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import atlas.api.Country;

public class JPADao implements DAO {

	static EntityManagerFactory factory= Persistence.createEntityManagerFactory("atlas");
	static {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Country country1 = new Country("India", "New Delhi", "Rupee");
		Country country2 = new Country("USA", "Washington", "US Dollar");
		em.persist(country1);
		em.persist(country2);
		em.getTransaction().commit();
	}

	@Override
	public Country get(String countryName) {
		EntityManager em = factory.createEntityManager();
		Country country = em.find(Country.class, countryName);
		return country;
	}

}
