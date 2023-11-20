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
		// 比較字串值是否一樣
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println("====================");
		String str3 = "aBc";
		System.out.println(str.equals(str3));
		// 比較字串值是否一樣，但不比較字母的大小寫
		System.out.println(str.equalsIgnoreCase(str3));
	}

	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		// length ()看字串長度是多少 ( 空白也算一個字 )
		System.out.println("str + length: " + str.length());
		System.out.println("str1 + length: " + str1.length());
		System.out.println("str2 + length: " + str2.length());
		System.out.println("=================");
		// isEmpty() 看字串是否為 0
		System.out.println("str1 + isEmpty: " + str1.isEmpty());
		System.out.println("str2 + isEmpty: " + str2.isEmpty());
		System.out.println("=================");
		// isBlank(): 1.長度為0 ; 2. 字串內容由全空白組成:滿足條件 1或2 則回傳 true
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
		// null.任何方法是錯誤的所以沒辦法變辨識
//		System.out.println(color.length());
		// null 要比較就使用 == null
		System.out.println(color == null);
		// 一定要先判斷 null
		color = " ";
		if (color == null || color.isBlank()) {
			System.out.println("color 是空字串!!");
		} else {
			System.out.println("color 不是空字串!!");
		}
		System.out.println("================");
		// 有空白 字所以true
		System.out.println(StringUtils.hasLength("  "));
		// 沒內容所以false
		System.out.println(StringUtils.hasText("  "));
		System.out.println("================");
		if (StringUtils.hasText(color)) {
			System.out.println("color 有內容!!");
		} else {
			System.out.println("color 沒~~~內容!!");
		}
		System.out.println("================");
		System.out.println("================");
		// +驚嘆號
		if (!StringUtils.hasText(color)) {
			System.out.println("color 沒~~~內容!!");
		} else {
			System.out.println("color 有內容!!");
		}
		System.out.println("================");
	}

	@Test
	public void stringTest3() {
		Scanner scan = new Scanner(System.in);
		String str = "小龍女神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String ans = scan.next();
		int k = 0;// 索引值
		int num = 0;
		System.out.println(str.indexOf(ans, k));// 收尋到第一個 ans 的值
		while (str.indexOf(ans, k) >= 0) {
			num = num + 1; // 統計你收尋到 ans 值的次數
			k = (str.indexOf(ans, k)) + ans.length(); // k = 收尋到第一個 ans 的值 加上 你 ans 的字數
		}
		System.out.println(num);
	}

	@Test
	public void replaceTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		// replace 取代全部
		str = str.replace("小龍女", "小籠包");
		System.out.println(str);
		System.out.println("====================");
		str = str.replaceAll("小籠包", "菜頭");
		System.out.println(str);
	}

	@Test
	public void splitTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		// 裁切
		String[] array = str.split("小龍女");
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
		// trim 刪除
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
		// 擷取
		String str = "神鵰俠侶是楊過與小龍女的故事";
		String subStr = str.substring(5);
		// 擷取5~11中的4個數
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
		// Buffer 增加文字在後方
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb.equals(sb1));
		System.out.println("=================");
		// toString 轉成字串
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
			System.out.println("4迴文");
		} else {
			System.out.println("84迴文");
		}
	}

	@Test
	public void Test2() {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("請輸入2個以上的文字");
			String str = scan.next();
			if (str.length() <= 2) {
				System.out.println("try again!!");
				continue;
			}
			StringBuffer sb = new StringBuffer(str);
			if (str.equals(sb.reverse().toString())) {
				System.out.println("4迴文");
			} else {
				System.out.println("84迴文");
			}
			break;
		}
	}
	@Test
	public void Test3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int inputInt = scan.nextInt();
		inputInt++;
		String str =String.valueOf(inputInt);
		String[] strArry = str.split("");
		System.out.println(new ArrayList<>(Arrays.asList(strArry)));
	}

}
