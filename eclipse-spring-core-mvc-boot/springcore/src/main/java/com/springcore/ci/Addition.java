package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor : double ,double");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor : int ,int");
	}
	
	
	public void sum() {
		System.out.println("sum is : "+(this.a+this.b));
	}


	@Override
	public String toString() {
		return super.toString();
	}

}
