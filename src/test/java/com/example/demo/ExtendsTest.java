package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.A1;
import com.example.demo.entity.Animal;
import com.example.demo.entity.Bird;
import com.example.demo.entity.C;
import com.example.demo.entity.Car;
import com.example.demo.entity.Cat;
import com.example.demo.entity.Dog;

public class ExtendsTest {

	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("父類別 Anim name:" + anim.getName());
		anim.eat();
		anim.sleep();
		// 父子的建構方法，在new之後會先執行父類別的方法之後再執行子類別
		Bird bird = new Bird();
		// 先設定名字
		// 子類別可以繼承父類別的(方法及屬性)
		bird.setName("小花");
		System.out.println("子類別 bird name:" + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
		Cat cat = new Cat();
		cat.setName("夜煞");
		System.out.println("子類別 cat name:" + cat.getName());
		cat.eat();
		cat.sleep();
		cat.barking();
	}

	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		// 透過類別 A1 取得類別 C 中的私有屬性 city
		a1.getC().getCity();
		// 執行上述程式會報NullPoniterException
		// 因為類別 A1 中的私有屬性 C 也是類別，類別預設值(是) null
		// a1.getC() 得到的值是null，null 在呼叫方法時就會 (報錯)
	}

	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		// 透過類別 A1 取得類別 C 中的私有屬性 city
		String city = a1.getC().getCity();
		System.out.println(city);
		// 因為類別 A1 中的私有屬性 C 有給預設值，所以預設值就(不是) null
		// 但類別 C 中的屬性一樣是預設值， city 是 String 預設值就是 null
	}

	@Test
	public void extendsTest3() {
		C c = new C("AAA", "BB", "C");
		A1 a1 = new A1();
		a1.setC(c);
		a1.setAddress("DDD");
		System.out.println("======================");
		System.out.println("city: " + a1.getC().getCity());
		System.out.println("country: " + a1.getC().getConutry());
		System.out.println("state: " + a1.getC().getState());
		System.out.println("address: " + a1.getAddress());
	}

	@Test
	public void extendsTest4() {
		Animal anim = new Animal();
		anim.eat();
		Bird bird = new Bird();
		bird.eat();
		Cat cat = new Cat();
		cat.eat();
		System.out.println("================");
		// 實際上執行在Brid ,做事的是子類別,但外在形勢是父類別,所以只能抓取父類別有的東西
		Animal animm = new Animal();
		animm.eat();
		Animal birdd = new Bird();
		birdd.eat();
		Animal catt = new Cat();
		catt.eat();
	}

	// 定義方法會寫在Service.ifs
	@Test
	public void interfaceTest() {
		Car car = new Car();
		car.run();
		Dog dog = new Dog();
		dog.run();
	}

}
