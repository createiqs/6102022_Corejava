package com.createiq.hashcode.demo;

public class Customer implements Cloneable {

	private int cid;
	private String name;
	private Address address;
	private Product produts;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, Address address) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
	}

	public Customer(int cid, String name, Address address, Product produts) {
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.produts = produts;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c1 = (Customer) super.clone();
		c1.address = (Address) address.clone();
		c1.produts = (Product) produts.clone();
		return c1;
	}

	public Product getProduts() {
		return produts;
	}

	public void setProduts(Product produts) {
		this.produts = produts;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", produts=" + produts + "]";
	}

}
