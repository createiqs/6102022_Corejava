package com.createiq.hashcode.demo;

public class FinalizeMethodDemo {

	private int id;

	public FinalizeMethodDemo(int id) {
		this.id = id;
		System.out.println("instance id: " + id);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(" finalize method is invoking.........");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			new FinalizeMethodDemo(i);
		}
	}
}
