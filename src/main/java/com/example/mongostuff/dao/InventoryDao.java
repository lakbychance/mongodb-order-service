package com.example.mongostuff.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongostuff.model.Inventory;

public interface InventoryDao extends MongoRepository<Inventory,String> {
	
	Inventory findByName(String name);

}
