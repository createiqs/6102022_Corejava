package com.createiq.hashcode.demo;

public class Student {

	private int id;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		return this.id;
//	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "anil");
		Student s2 = new Student(2, null);
		Student s3 = new Student(1, "anil");
		Student s4 = null;
		Student s5 = s1;
		System.out.println(s5.equals(s4));
//		Student s6=new Student(0, " ");
//		Student s7=new Student(0, null);
		System.out.println(s1.hashCode());
		System.out.println(s5.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s5));
//		System.out.println(s1.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
