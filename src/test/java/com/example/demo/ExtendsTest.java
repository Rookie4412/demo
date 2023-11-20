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
		System.out.println("�����O Anim name:" + anim.getName());
		anim.eat();
		anim.sleep();
		// ���l���غc��k�A�bnew����|����������O����k����A����l���O
		Bird bird = new Bird();
		// ���]�w�W�r
		// �l���O�i�H�~�Ӥ����O��(��k���ݩ�)
		bird.setName("�p��");
		System.out.println("�l���O bird name:" + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
		Cat cat = new Cat();
		cat.setName("�]��");
		System.out.println("�l���O cat name:" + cat.getName());
		cat.eat();
		cat.sleep();
		cat.barking();
	}

	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		// �z�L���O A1 ���o���O C �����p���ݩ� city
		a1.getC().getCity();
		// ����W�z�{���|��NullPoniterException
		// �]�����O A1 �����p���ݩ� C �]�O���O�A���O�w�]��(�O) null
		// a1.getC() �o�쪺�ȬOnull�Anull �b�I�s��k�ɴN�| (����)
	}

	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		// �z�L���O A1 ���o���O C �����p���ݩ� city
		String city = a1.getC().getCity();
		System.out.println(city);
		// �]�����O A1 �����p���ݩ� C �����w�]�ȡA�ҥH�w�]�ȴN(���O) null
		// �����O C �����ݩʤ@�ˬO�w�]�ȡA city �O String �w�]�ȴN�O null
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
		// ��ڤW����bBrid ,���ƪ��O�l���O,���~�b�ζլO�����O,�ҥH�u���������O�����F��
		Animal animm = new Animal();
		animm.eat();
		Animal birdd = new Bird();
		birdd.eat();
		Animal catt = new Cat();
		catt.eat();
	}

	// �w�q��k�|�g�bService.ifs
	@Test
	public void interfaceTest() {
		Car car = new Car();
		car.run();
		Dog dog = new Dog();
		dog.run();
	}

}
