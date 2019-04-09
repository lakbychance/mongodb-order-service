package com.example.mongostuff.service;

import java.util.List;

import com.example.mongostuff.model.Account;
import com.example.mongostuff.model.Inventory;
import com.example.mongostuff.model.Order;

public interface MongoService {
	public void createAccount(Account account);
	public List<Account> getAccounts();
	public String updateOrders(String name,Order order);
	public void createInventory(Inventory inventory);

}
