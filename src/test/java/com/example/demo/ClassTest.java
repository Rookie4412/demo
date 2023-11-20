package com.example.demo;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class ClassTest {

	@Test
	public void classTest() {
		Dog yourDog = new Dog();
//		System.out.println(yourDog.getName());
		yourDog.setName("cat");
		////////////////////////////
		Dog myDog = new Dog();
//		System.out.println(myDog.getName());
		myDog.setName("God");
		System.out.println(yourDog.getName());
		System.out.println(myDog.getName());

	}

	@Test
	public void classTest1() {
		Dog dog = new Dog();
		dog.setAttributes("lili", "blue", 5);
	}

	@Test
	public void classTest2() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance());
		Assert.isTrue(bank.getBalance() == 1000, "saving error");

		bank.saving(500);
		Assert.isTrue(bank.getBalance() == 1500, "saving error");
		System.out.println(bank.getBalance());

		bank.saving(500);
		Assert.isTrue(bank.getBalance() == 2000, "saving error");
		System.out.println(bank.getBalance());
	}

	@Test
	public void classTest3() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance());
		Assert.isTrue(bank.getBalance() == 1000, "saving error");

		bank.withdraw(500);
		Assert.isTrue(bank.getBalance() == 500, "saving error");
		System.out.println(bank.getBalance());

		bank.withdraw(200);
		Assert.isTrue(bank.getBalance() == 300, "saving error");
		System.out.println(bank.getBalance());

	}

	@Test
	public void classTese() {
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		System.out.println("=================");
		Integer a1 = 10;
		Integer b1 = 10;
		System.out.println(a1 == b1);
		System.out.println("=================");
		Integer a2 = new Integer(10);
		Integer b2 = new Integer(10);
		System.out.println(("a2 == b2") + (a2 == b2));
		System.out.println("=================");
		boolean boo1 = false;
		boolean boo2 = false;
		System.out.println(boo1 == boo2);
	}

	@Test
	public void classTese1() {
		TaipeiBank bank = new TaipeiBank();
		int a = 10;
		for (int i = 0; i < 10; i++) {

		}
		if (a > 20) {
			System.out.println("+++++++++++++");
		}
		int b = 20;
		System.out.println(b);
		System.out.println(a);
	}

	// 匿名類別
	@Test
	public void classTese2() {
//		TaipeiBank bank = new TaipeiBank(); 
//		System.out.println(bank);
		System.out.println(new TaipeiBank()); // bank = new TaipeiBank ,所以直接印出 new TaipeiBank 可以減少程式碼
	}

	@Test
	public void classTest6() {
		Dog dog = new Dog();
		dog.setName("geily");
		dog.setColor("skyblue");
		dog.setAge(8);
		System.out.println("=============");
		Dog dogg = new Dog("geliy", "skyblue", 8);
		System.out.println("=============");
	}

	@Test
	public void classTest7() {
		Dog dog = new Dog();
		dog.setAttributes1(); // 一般方法的呼叫，必須要先把類別new出來
		Dog.setAttributes2(); // static 方法的呼叫，直接用類別名稱.static 方法
		System.out.println("============");
		Math.random();
		Random ran = new Random();
		ran.nextInt();
		System.out.println("============");
		int a=100;
		a=200;
		//final 設定完值之後就(無法跟改)
		final int b = 10;
//		b=50;
		
	}
}
