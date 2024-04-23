package com.HibernatePractice.CNCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HibernatePractice.CNCart.Entity.Item;
import com.HibernatePractice.CNCart.Service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;

	@PostMapping("/save")
	public void saveItem(@RequestBody Item item) {
		
		itemService.saveItem(item);
		
	}
}
