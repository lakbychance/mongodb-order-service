package com.example.mongostuff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongostuff.model.Account;
import com.example.mongostuff.model.Inventory;
import com.example.mongostuff.model.Order;
import com.example.mongostuff.service.MongoService;

@RestController
public class mongoController {
	@Autowired
	private MongoService mongoService;

@PostMapping("account")
public void create(@RequestBody Account account)
{
	mongoService.createAccount(account);
}
@GetMapping("/accounts")
public List<Account> getAccounts()
{
	return mongoService.getAccounts();
}
@PostMapping("/account/{accountName}")
public String updateOrders(@PathVariable("accountName") String accountName, @RequestBody Order order)
{
	String status = mongoService.updateOrders(accountName, order);
	return status;
}
@PostMapping("/inventory")
public void createInventory(@RequestBody Inventory inventory)
{
	mongoService.createInventory(inventory);
}
}
