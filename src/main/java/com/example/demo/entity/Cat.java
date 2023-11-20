package com.example.demo.entity;

public class Cat extends Animal {
	private String name;

	public void eat() {
		System.out.println(super.getName() + " 正在吃貓條!!!");
	}

	public void sleep() {
		System.out.println(super.getName() + " 正要去睡ZZZ");
	}

	public void barking() {
		System.out.println(super.getName() + " 正在野鳥叫...");
	}

}
