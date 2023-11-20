package com.example.demo.entity;

public class C {

	private String city;

	private String state;

	private String conutry;
	
	
	public C() {
		super();
		
	}
	
	public C(String city, String state, String conutry) {
		super();
		this.city = city;
		this.state = state;
		this.conutry = conutry;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConutry() {
		return conutry;
	}

	public void setConutry(String conutry) {
		this.conutry = conutry;
	}

}
