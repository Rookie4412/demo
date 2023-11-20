package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest {

	// 陣列
	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a);
		// De bug (斷點) :在左邊藍色區域點兩下可以讓測試到這停止在這裡，按下紅色中止鍵即可停止
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 5;
		System.out.println(a);
		System.out.println("=================");
		int[] b = { 1, 2, 5, 8, 9 };
		// 印出陣列內的特定數字
		System.out.println(b[3]);
		for (int item : b) {
			System.out.println(item);
		}
	}

	// List
	@Test
	public void listTest() {
		// List <~~~ 這裡放資料型態 (!! 必填) ~~~> 變數名稱
		// List 宣告是介面，所以無法使用new List , 請使用ArrayList<~~ 資料型態 (!可不用填)~~> ()
		// ArrayList 的資料是動態的
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("C");
		strList.add("B");
		strList.add("Z");
		System.out.println(strList);
		System.out.println("=================");
		// List 是有順序的 , 依照加入的先後順序
		System.out.println(strList.size());
		// size 是取出陣列內總數
		System.out.println("=================");
		// 用for迴圈取出你要的值
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("=================");
		// List.of 是無法跟改的
		List<String> strList1 = List.of("A", "B", "Q", "5");
		List<String> strList2 = Arrays.asList("A1", "B2", "Q3", "54");
		// 執行下一行程式會報錯 因為用List.of()產生的List 大小固定，無法再增刪
// 		strList1.add("G");
		// Arrays.asList 大小固定，無法再增刪
//		strList2.add("G");
		System.out.println("=================");
		// 這樣就可以新增新的東西
		List<String> strList3 = new ArrayList<>(List.of("A", "B", "Q", "5"));
		List<String> strList4 = new ArrayList<>(Arrays.asList("A1", "B2", "Q3", "54"));
	}

	// foreach
	@Test
	public void foreachTest() {
		List<String> strList = new ArrayList<>(List.of("A", "B", "Q", "5"));
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("=================");
		// 用冒號分隔左右,item 是陣列內的每一項
		// foreach:變歷，意思是指將 List 裡的項目從頭到尾(一個一個)取出
		for (String item : strList) {
			System.out.println(item);
		}
		System.out.println("=================");
		// 題外話
		strList.forEach(item -> {
			System.out.println(item);
		});
	}

	@Test
	public void listTest1() {
		int[] a = new int[3];
		Integer[] b = new Integer[3];
		String[] c = new String[4];
		List<String> strList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
	}

	@Test
	public void listTest2() {
		String str = "ABC";
		String str1 = new String("ADC");
		//null空值無法更改
		String str2 = null;
	}
	@Test
	public void listTest3() {
		String str = "ABC";
		String str1 = new String("ADC");
		//null空值無法更改
		String str2 = null;
	}

}
