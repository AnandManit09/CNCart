package com.HibernatePractice.CNCart.DAL;

import org.hibernate.Session;
//import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HibernatePractice.CNCart.Entity.Item;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDALImpl implements ItemDAL {
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void save(Item item) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.save(item);
	}

	
}
