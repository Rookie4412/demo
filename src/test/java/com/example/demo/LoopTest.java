package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {
	// for迴圈
	@Test
	public void loopTest() {
		System.out.println("============");
		for (int i = 1; i < 5; i++) {
			System.out.println("i=" + i);
		}
	}

	// 乘法表
	@Test
	public void nightTest() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // 換行用
		}
	}

	@Test
	public void nightTest1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					// 如果 j == 2 跳過
					continue;
				}
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // 換行用
		}
	}

	@Test
	public void nightTest2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					// 如果 j == 2 時(跳出)離 break 最近的迴圈
					break;
				}
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // 換行用
		}
	}

	@Test
	public void nightTest3() {
		// 標記 for 迴圈為 a
		a: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					// 如果 j == 2 時(跳出) a 的迴圈
					break a;
				}
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // 換行用
		}
	}

	@Test
	public void guessTest() {
		// 1~99
		// random 公式 : (區域 上 限值 - 區域 下 限值+1)+區域 下 限值
		double random = Math.random() * (99 - 1 + 1) + 1;
		// 例: 20 ~ 50 : 區域上限值是 50 ,區域下限值是 20
		double random1 = Math.random() * (50 - 20 + 1) + 20;
		System.out.println("============");
		Random ran = new Random();
		// Random 類別裡的 nextInt()
		int a = ran.nextInt(99) + 1;
	}

	// 1~99猜數字
	@Test
	public void homework() {
		Scanner scan = new Scanner(System.in);
		int min = 1;
		int big = 99;
//		Random ran = new Random();
//		int bingo = ran.nextInt(99) + 1;
//		Random ran = new Random();
//		int bingo = ran.nextInt(99,1)
		int bingo = (int) (Math.random() * (99 - 1 + 1)) + 1;
		while (true) {
			System.out.printf("猜數字%d~%d", min, big);
			int guess = scan.nextInt();
			if (guess < min || guess > big) {
				System.out.println("請輸入範圍值");
				continue;
			}
			if (guess == bingo) {
				System.out.println("答對了");
				break;
			}
			if (guess < bingo) {
				min = guess;
			}else {
				big = guess;
			}
		}
	}
	
	//陣列
	//宣告方式
	int [] b= new int [10];
	int a[]  ;
	
	
}
