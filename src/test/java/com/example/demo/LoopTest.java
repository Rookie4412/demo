package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {
	// for�j��
	@Test
	public void loopTest() {
		System.out.println("============");
		for (int i = 1; i < 5; i++) {
			System.out.println("i=" + i);
		}
	}

	// ���k��
	@Test
	public void nightTest() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // �����
		}
	}

	@Test
	public void nightTest1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					// �p�G j == 2 ���L
					continue;
				}
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // �����
		}
	}

	@Test
	public void nightTest2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					// �p�G j == 2 ��(���X)�� break �̪񪺰j��
					break;
				}
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // �����
		}
	}

	@Test
	public void nightTest3() {
		// �аO for �j�鬰 a
		a: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					// �p�G j == 2 ��(���X) a ���j��
					break a;
				}
				System.out.printf("%d*%d = %2d\t", i, i, i * j);
			}
			System.out.println(""); // �����
		}
	}

	@Test
	public void guessTest() {
		// 1~99
		// random ���� : (�ϰ� �W ���� - �ϰ� �U ����+1)+�ϰ� �U ����
		double random = Math.random() * (99 - 1 + 1) + 1;
		// ��: 20 ~ 50 : �ϰ�W���ȬO 50 ,�ϰ�U���ȬO 20
		double random1 = Math.random() * (50 - 20 + 1) + 20;
		System.out.println("============");
		Random ran = new Random();
		// Random ���O�̪� nextInt()
		int a = ran.nextInt(99) + 1;
	}

	// 1~99�q�Ʀr
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
			System.out.printf("�q�Ʀr%d~%d", min, big);
			int guess = scan.nextInt();
			if (guess < min || guess > big) {
				System.out.println("�п�J�d���");
				continue;
			}
			if (guess == bingo) {
				System.out.println("����F");
				break;
			}
			if (guess < bingo) {
				min = guess;
			}else {
				big = guess;
			}
		}
	}
	
	//�}�C
	//�ŧi�覡
	int [] b= new int [10];
	int a[]  ;
	
	
}
