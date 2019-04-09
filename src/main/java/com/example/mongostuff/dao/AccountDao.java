package com.example.mongostuff.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongostuff.model.Account;
import com.example.mongostuff.model.Order;

public interface AccountDao extends MongoRepository<Account,String> {

	Account findByName(String name);
}
