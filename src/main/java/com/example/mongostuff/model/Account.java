package com.example.mongostuff.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {
	
	@Id
	private String id;
	private String name;
	private List<Order> orders;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public List<Order> getOrders()
	{
		return orders;
	}
	public void setOrders(List<Order> orders)
	{
		this.orders=orders;
	}

}
