package com.createiq.hashcode.demo;

public class Employee implements Cloneable {

	private int id;
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(Employee copy) {
		this.id = copy.id;
		this.name = copy.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee origanlData = new Employee(100, "anil");
		System.out.println(origanlData);
		Employee copy = new Employee(origanlData);
		System.out.println(copy);
		Employee clonedDate = (Employee) origanlData.clone();
		System.out.println(clonedDate);
		origanlData.setName("anil b");
		System.out.println("After updating original data: " + origanlData);
		System.out.println("After updating cloned data: " + clonedDate);
	}

}
