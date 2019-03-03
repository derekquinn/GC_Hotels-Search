package com.hotel.search;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class HotelDao {
	@PersistenceContext
	private EntityManager em;
	
	public List<Hotel> findAll() {
		// BeanPropertyRowMapper uses the rows from the SQL result create
		// new Room objects and fill in the values by calling the setters.
		// Use .query for SQL SELECT statements.
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}
	
	public List<Hotel> findHotelList(String city) {
		return em.createQuery("FROM Hotel WHERE city = :city ORDER BY price_per_night", Hotel.class).setParameter("city", city).getResultList();
	}
	
	public List<String> findCityList() {
		return em.createQuery("SELECT DISTINCT city FROM Hotel", String.class).getResultList();
	}
	
	public void create(Hotel aHotel) {
		em.persist(aHotel);
	}

	public Hotel findById(Long id) {
		return em.find(Hotel.class, id);
	}
	public Hotel findByCity(Long id) {
		return em.find(Hotel.class, id);
	}

	public void update(Hotel aHotel) {
		em.merge(aHotel);
	}

}
