package com.example.demo.entity;

//has-a »E¦X
public class A1 extends C{
	
//	private String city;
//
//	private String state;
//
//	private String conutry;
	
	private C c = new C();

	private String address;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
