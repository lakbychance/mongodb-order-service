package com.example.mongostuff.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {
	 
	@Id
	private String id;
	private String name;
	private String stock;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getStock()
	{
		return stock;
	}
	public void setStock(String stock)
	{
		this.stock = stock;
	}

}
