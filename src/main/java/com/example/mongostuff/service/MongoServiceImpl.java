package com.example.mongostuff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongostuff.dao.AccountDao;
import com.example.mongostuff.dao.InventoryDao;
import com.example.mongostuff.model.Account;
import com.example.mongostuff.model.Inventory;
import com.example.mongostuff.model.Order;
@Service
public class MongoServiceImpl implements MongoService {


	@Autowired
	private AccountDao accountDao;
	@Autowired
	private InventoryDao inventoryDao;
	@Override

	
	public void createAccount(Account account)
	{
		accountDao.save(account);
	}
	public void createInventory(Inventory inventory)
	{
		inventoryDao.save(inventory);
	}
	public List<Account> getAccounts()
	{
		return accountDao.findAll();
	}
	public String updateOrders(String name,Order order)
	{
		Inventory existingInventory = inventoryDao.findByName(order.getName());
		int existingStock = Integer.parseInt(existingInventory.getStock());
		if(existingStock>0)
		{
		Account existingAccount = accountDao.findByName(name);
		List<Order> existingOrders = existingAccount.getOrders();
		existingOrders.add(order);
		existingAccount.setOrders(existingOrders);
		accountDao.save(existingAccount);
		return "Order successfully placed";
		}
		else
		{
		return "Product out of stock";
		}
		
	}

}
