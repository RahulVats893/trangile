package com.springcore;

public class Student {
	private int sid;
	private String sname;
	private String sAddress;
	 
	public Student(int sid, String sname, String sAddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sAddress = sAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sAddress=" + sAddress + "]";
	}
	

}
