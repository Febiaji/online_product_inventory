package com.techpalle.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int pid;
   private String pname;
   private int price;
   private int quantity;
   
   public Product()
   {
	   
   }
   
public Product(int pid, String pname, int price, int quantity) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.quantity = quantity;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
