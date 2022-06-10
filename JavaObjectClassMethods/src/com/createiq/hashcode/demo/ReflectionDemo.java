package com.createiq.hashcode.demo;

import java.lang.reflect.Field;

public class ReflectionDemo {

	int id;

	public ReflectionDemo() {
		System.out.println(" constructor");
	}

	public ReflectionDemo(int id) {
		this.id = id;
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		String s1 = "anil";
		System.out.println(s1.getClass());
		Class class1 = s1.getClass();
		System.out.println(class1);
		Field[] fields = class1.getFields();
		System.out.println(fields[0]);
//		System.out.println(fields[1]);
		System.out.println(class1.getConstructor());
		ReflectionDemo demo = new ReflectionDemo();
		System.out.println(demo.getClass());

		Class class2 = demo.getClass();
		System.out.println(class2.getModifiers());
		System.out.println(class2.getFields());
		Field[] fields2 = class2.getFields();
		for (Field f : fields2) {
			System.out.println(f);
		}

		System.out.println(class2.getConstructors());

	}

}
