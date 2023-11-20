package com.example.demo;

import org.junit.jupiter.api.Test;

//@SpringBootTest
public class DemoApplicationTests {
	// @Test想測試結果可加入這個
	// public權限
	// void: 回傳資料型態但不回傳任何值 , @Test內回傳都是void喔~~~
	// firstTest方法名稱(可改變):小括號()內可以帶參數 ,大括號{}內是邏輯區塊
	@Test
	public void firstTest() {
		int a = 1234567891;
		// java內預設資料整數是int所以要在後方加入大OR小寫L
		long b = 1234567891132L;
		System.out.println(a);
//		String str = new String("ABC");
		String str = "123";
		String str1 = "ABC";
		System.out.println(str + str1);

	}

}
