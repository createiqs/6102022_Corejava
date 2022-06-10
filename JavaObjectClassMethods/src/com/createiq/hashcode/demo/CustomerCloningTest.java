package com.createiq.hashcode.demo;

public class CustomerCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product product=new Product("Apple Mac book");
		Address address = new Address("Hyd", "TS");
		Customer origanlData = new Customer(100, "anil", address, product);
		Customer clonedData = (Customer) origanlData.clone();
		System.out.println("original data: " + origanlData);
		System.out.println("cloned Data: " + clonedData);
		origanlData.getAddress().setCity("Pune");
		origanlData.setName("anil b");
		product.setItems("Apple Mac Book M1 Chip");
		System.out.println("Afer update original data: " + origanlData);
		System.out.println("cloned Data: " + clonedData);

	}

}
