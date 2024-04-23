package com.HibernatePractice.CNCart.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HibernatePractice.CNCart.DAL.ItemDAL;
import com.HibernatePractice.CNCart.DAL.ItemDALImpl;
import com.HibernatePractice.CNCart.Entity.Item;

import jakarta.transaction.Transactional;

@Service
public class ItemService {

	@Autowired
	ItemDALImpl itemDAL;
	
	@Transactional
	public void saveItem(Item item) {
		itemDAL.save(item);
	}
}
