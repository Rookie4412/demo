package com.example.demo.entity;

//extends 一定要加s
public class Bird extends Animal {

	public Bird() {
		super();
//		System.out.println("Bird 建構方法");
	}

	// @Override:覆寫 OR 重新定義
	// 父子類別有相同方法(名稱 + 參數個數)，子類別對此方法重新定義自己實作內容
	// @Override 加了可以提醒自己父類別有相同方法
	@Override
	public void eat() {
		System.out.println(super.getName() + " 邊玩邊吃!!!");
	}

	public void sleep() {
		System.out.println(super.getName() + " 邊玩邊睡ZZZ");
	}

	public void flying() {
		System.out.println(super.getName() + " 正在飛~~~");
	}

}
