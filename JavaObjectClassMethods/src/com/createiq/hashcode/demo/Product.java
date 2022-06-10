package com.createiq.hashcode.demo;

public class Product implements Cloneable {

	private String items;

	public Product(String items) {
		super();
		this.items = items;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Product [items=" + items + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	

}
