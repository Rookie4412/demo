package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest {

	// �}�C
	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a);
		// De bug (�_�I) :�b�����Ŧ�ϰ��I��U�i�H�����ը�o����b�o�̡A���U���⤤����Y�i����
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 5;
		System.out.println(a);
		System.out.println("=================");
		int[] b = { 1, 2, 5, 8, 9 };
		// �L�X�}�C�����S�w�Ʀr
		System.out.println(b[3]);
		for (int item : b) {
			System.out.println(item);
		}
	}

	// List
	@Test
	public void listTest() {
		// List <~~~ �o�̩��ƫ��A (!! ����) ~~~> �ܼƦW��
		// List �ŧi�O�����A�ҥH�L�k�ϥ�new List , �Шϥ�ArrayList<~~ ��ƫ��A (!�i���ζ�)~~> ()
		// ArrayList ����ƬO�ʺA��
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("C");
		strList.add("B");
		strList.add("Z");
		System.out.println(strList);
		System.out.println("=================");
		// List �O�����Ǫ� , �̷ӥ[�J�����ᶶ��
		System.out.println(strList.size());
		// size �O���X�}�C���`��
		System.out.println("=================");
		// ��for�j����X�A�n����
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("=================");
		// List.of �O�L�k��諸
		List<String> strList1 = List.of("A", "B", "Q", "5");
		List<String> strList2 = Arrays.asList("A1", "B2", "Q3", "54");
		// ����U�@��{���|���� �]����List.of()���ͪ�List �j�p�T�w�A�L�k�A�W�R
// 		strList1.add("G");
		// Arrays.asList �j�p�T�w�A�L�k�A�W�R
//		strList2.add("G");
		System.out.println("=================");
		// �o�˴N�i�H�s�W�s���F��
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
		// �Ϋ_�����j���k,item �O�}�C�����C�@��
		// foreach:�ܾ��A�N��O���N List �̪����رq�Y���(�@�Ӥ@��)���X
		for (String item : strList) {
			System.out.println(item);
		}
		System.out.println("=================");
		// �D�~��
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
		//null�ŭȵL�k���
		String str2 = null;
	}
	@Test
	public void listTest3() {
		String str = "ABC";
		String str1 = new String("ADC");
		//null�ŭȵL�k���
		String str2 = null;
	}

}
