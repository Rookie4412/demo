package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {

	@Test
	public void stringTest() {

		String str = "ABC";
		String str1 = new String("ABC");
		String str2 = "ABC";
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println("====================");
		// ����r��ȬO�_�@��
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println("====================");
		String str3 = "aBc";
		System.out.println(str.equals(str3));
		// ����r��ȬO�_�@�ˡA��������r�����j�p�g
		System.out.println(str.equalsIgnoreCase(str3));
	}

	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		// length ()�ݦr����׬O�h�� ( �ťդ]��@�Ӧr )
		System.out.println("str + length: " + str.length());
		System.out.println("str1 + length: " + str1.length());
		System.out.println("str2 + length: " + str2.length());
		System.out.println("=================");
		// isEmpty() �ݦr��O�_�� 0
		System.out.println("str1 + isEmpty: " + str1.isEmpty());
		System.out.println("str2 + isEmpty: " + str2.isEmpty());
		System.out.println("=================");
		// isBlank(): 1.���׬�0 ; 2. �r�ꤺ�e�ѥ��ťղզ�:�������� 1��2 �h�^�� true
		System.out.println("str1 + isBlank: " + str1.isBlank());
		System.out.println("str2 + isBlank: " + str2.isBlank());
	}

	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String name = dog.getName();
		String color = dog.getColor();
		System.out.println(name);
		System.out.println(color);
		System.out.println("================");
		System.out.println(name.length());
		// null.�����k�O���~���ҥH�S��k�ܿ���
//		System.out.println(color.length());
		// null �n����N�ϥ� == null
		System.out.println(color == null);
		// �@�w�n���P�_ null
		color = " ";
		if (color == null || color.isBlank()) {
			System.out.println("color �O�Ŧr��!!");
		} else {
			System.out.println("color ���O�Ŧr��!!");
		}
		System.out.println("================");
		// ���ť� �r�ҥHtrue
		System.out.println(StringUtils.hasLength("  "));
		// �S���e�ҥHfalse
		System.out.println(StringUtils.hasText("  "));
		System.out.println("================");
		if (StringUtils.hasText(color)) {
			System.out.println("color �����e!!");
		} else {
			System.out.println("color �S~~~���e!!");
		}
		System.out.println("================");
		System.out.println("================");
		// +��ĸ�
		if (!StringUtils.hasText(color)) {
			System.out.println("color �S~~~���e!!");
		} else {
			System.out.println("color �����e!!");
		}
		System.out.println("================");
	}

	@Test
	public void stringTest3() {
		Scanner scan = new Scanner(System.in);
		String str = "�p�s�k����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		String ans = scan.next();
		int k = 0;// ���ޭ�
		int num = 0;
		System.out.println(str.indexOf(ans, k));// ���M��Ĥ@�� ans ����
		while (str.indexOf(ans, k) >= 0) {
			num = num + 1; // �έp�A���M�� ans �Ȫ�����
			k = (str.indexOf(ans, k)) + ans.length(); // k = ���M��Ĥ@�� ans ���� �[�W �A ans ���r��
		}
		System.out.println(num);
	}

	@Test
	public void replaceTest() {
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		// replace ���N����
		str = str.replace("�p�s�k", "�pŢ�]");
		System.out.println(str);
		System.out.println("====================");
		str = str.replaceAll("�pŢ�]", "���Y");
		System.out.println(str);
	}

	@Test
	public void splitTest() {
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		// ����
		String[] array = str.split("�p�s�k");
		for (String item : array) {
			System.out.println(item);
		}
		System.out.println("=============");
		String str1 = "ABCD";
		String[] array1 = str1.split("");
		for (String item : array1) {
			System.out.println(item);
		}
	}

	@Test
	public void trimTest() {
		// trim �R��
		String str = "ABC DEF";
		String str1 = " ABC DEF";
		System.out.println(str.equals(str1));
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.equals(str1));
		System.out.println("=============");
		str = str.replace(" ", "");
		System.out.println(str);
	}

	@Test
	public void subsuringTest() {
		// �^��
		String str = "����L�Q�O���L�P�p�s�k���G��";
		String subStr = str.substring(5);
		// �^��5~11����4�Ӽ�
		String subStr1 = str.substring(5, 11);
		System.out.println(subStr);
		System.out.println(subStr1);
	}

	@Test
	public void subsuringBufferTest() {
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		sb.append("XAX");
		sb.append("DEF").append("DEF");
		System.out.println(sb);
		System.out.println("=================");
	}

	@Test
	public void subsuringBufferTest1() {
		// Buffer �W�[��r�b���
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb.equals(sb1));
		System.out.println("=================");
		// toString �ন�r��
		System.out.println(sb.toString().equals(sb1.toString()));
	}

	@Test
	public void Test() {
		String str = "ABACADEF";
		int index = str.lastIndexOf("A"); // index=4
		String lastString = str.substring(index); // lastString = ADEF
		lastString = lastString.replace("A", "W"); // lastString = WDEF
		str = str.substring(0, index) + lastString; // str.substring(0,index)
		System.out.println(str);
	}

	@Test
	public void Test1() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		if (str.equals(sb.reverse().toString())) {
			System.out.println("4�j��");
		} else {
			System.out.println("84�j��");
		}
	}

	@Test
	public void Test2() {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("�п�J2�ӥH�W����r");
			String str = scan.next();
			if (str.length() <= 2) {
				System.out.println("try again!!");
				continue;
			}
			StringBuffer sb = new StringBuffer(str);
			if (str.equals(sb.reverse().toString())) {
				System.out.println("4�j��");
			} else {
				System.out.println("84�j��");
			}
			break;
		}
	}
	@Test
	public void Test3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr");
		int inputInt = scan.nextInt();
		inputInt++;
		String str =String.valueOf(inputInt);
		String[] strArry = str.split("");
		System.out.println(new ArrayList<>(Arrays.asList(strArry)));
	}

}
