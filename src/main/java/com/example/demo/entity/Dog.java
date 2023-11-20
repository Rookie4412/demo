package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public class Dog implements RunService{

	private String name = "Apple";

	private String color;

	private int age;

	// 建構方法
	public Dog() {
		//繼承
		super();
	}

	public String getName() {
		return name;
	}

	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAttributes(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	// 報錯 有三種情況 setAttributes 名稱 ，()內的順序 ，()內的變數名
//	public void setAttributes(String name,String color,int age) {
//		this.name = name;
//		this.color = color;
//		this.age = age;
//	}
	
	public void setAttributes1() {
		System.out.println("==================");
	}
	public static void setAttributes2() {
		System.out.println("==================");
	}

	@Override
	public void run() {
		System.out.println("狗在草原上跑");
	}
}
