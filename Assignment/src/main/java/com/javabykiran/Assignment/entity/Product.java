package com.javabykiran.Assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	private int productid;
	private String name;
	private float price;
	@Id
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", price=" + price + "]";
	}
	
}
