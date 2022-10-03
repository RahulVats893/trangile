package com.springcore.ci;

public class Person {
	
	private String name;
	private String pid;
	private Certi certi;
	public Person(String name, String pid , Certi certi) {
		super();
		this.name = name;
		this.pid = pid;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + "{"+ this.certi.name+"}"+ "]";
	}

}
