package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public class Dog implements RunService{

	private String name = "Apple";

	private String color;

	private int age;

	// �غc��k
	public Dog() {
		//�~��
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
	// ���� ���T�ر��p setAttributes �W�� �A()�������� �A()�����ܼƦW
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
		System.out.println("���b���W�]");
	}
}
