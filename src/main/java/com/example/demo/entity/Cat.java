package com.example.demo.entity;

public class Cat extends Animal {
	private String name;

	public void eat() {
		System.out.println(super.getName() + " ���b�Y�߱�!!!");
	}

	public void sleep() {
		System.out.println(super.getName() + " ���n�h��ZZZ");
	}

	public void barking() {
		System.out.println(super.getName() + " ���b�����s...");
	}

}
