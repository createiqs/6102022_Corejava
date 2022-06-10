package com.createiq.hashcode.demo;

public class HashCodeDemo {

	public static void main(String[] args) {
		String s1 = "anil";
		String s2 = "raju";
		String s3 = "raju";
		String s6=s3;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.equals(s3));// true
		String s4 = "Ea";
		String s5 = "FB";
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s4.equals(s5));// false

	}

}
