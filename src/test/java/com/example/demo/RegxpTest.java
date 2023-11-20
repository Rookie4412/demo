package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegxpTest {
	// ����q��
	@Test
	public void regxpTest() {
		String str = "0912-345-678";
		// �o�� \ �����W�s�b�L�O���N�q�� �A�Ĥ@�ӱ׽u\�N�����r�� �A�ĤG�ӱ׽u \ �|���Ĥ@�ӱ׽u�ܦ��L�N�q��
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d"; // \\d = d�N��Ʀr���N��
		System.out.println(str.matches(pattern));
		System.out.println("=====================");
		String pattern2 = "\\d{4}-\\d{3}-\\d{3}"; // �]�i�H�ϥγo�ؤ覡
		System.out.println(str.matches(pattern2));
		System.out.println("=====================");
		String pattern3 = "\\d{4}(-\\d{3}){2}"; // �]�i�H��=�γo�ؤ覡
		System.out.println(str.matches(pattern3));
	}

	// �����q��
	@Test
	public void regxpTest1() {
//		String pattern = "(\\d{2})\\d{8}"; // �榡(2�X)8�X�A���]�t�p�A�� ;�p�A���u�����ե�
		String pattern = "\\(\\d{2}\\)\\d{8}"; // �榡(2�X)8�X�A�]�t�p�A��
	}

	@Test
	public void regxpTest2() {
		String patternA = "\\(\\d{2}\\)\\d{8}";
		String patternB = "\\(\\d{2}\\)\\d{7}";
		// ���޾�X�Ϊk patternA�AB == pattern1�A2 �ĪG�@�� �i�D�ݳ߷R���ϥ�
		String pattern = "\\(\\d{2}\\)(\\d{7}|\\d{8})"; // (02)12345678 or (02)1234567
		String pattern1 = "\\(\\d{2}\\)\\d{7}||\\(\\d\\)\\d{8}";
		String pattern2 = "(\\d{2})-\\d{8}";
		String pattern3 = "(\\d{2})-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����q��");
		System.out.println("�q�ܮ榡��(02)12345678 �� (02)1234567");
		System.out.println("�q�ܮ榡��02-12345678 �� 02-1234567");
		String str = scan.next();
		if (str.matches(pattern) || str.matches(pattern1) || str.matches(pattern2) || str.matches(pattern3)) {
			System.out.println("���T�q��");
		} else {
			System.out.println("�п�J���T�q��");
		}
	}

	@Test
	public void regxpTest3() {
		String patternA = "\\(\\d{2}\\)\\d{7,8}";
		String pattern3 = "(\\d{2})-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����q��");
		System.out.println("�q�ܮ榡��(02)12345678 �� (02)1234567");
		System.out.println("�q�ܮ榡��02-12345678 �� 02-1234567");
		String str = scan.next();
		if (str.matches(patternA) || str.matches(pattern3)) {
			System.out.println("���T�q��");
		} else {
			System.out.println("�п�J���T�q��");
		}
	}

	// ���x�q��
	@Test
	public void regxpTest5() {
		// �`�M��k
		String pattern = "(\\(\\d{2,4}\\)||\\d{2,4}-)\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����q��");
		System.out.println("�q�ܮ榡��(02)12345678 �� (02)1234567");
		System.out.println("�q�ܮ榡��02-12345678 �� 02-1234567");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("���T�q��");
		} else {
			System.out.println("�п�J���T�q��");
		}
	}

	@Test
	public void regxpTest6() {
		String pattern = "0\\d{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����q��");
		System.out.println("�q�ܮ榡��02-12345678");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("���T�q��");
		} else {
			System.out.println("�п�J���T�q��");
		}
	}

	@Test
	public void regxpTest7() {
		String pattern = "0[1-9]{1,3}-[0-9]{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����q��");
		System.out.println("�q�ܮ榡��02-12345678");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("���T�q��");
		} else {
			System.out.println("�п�J���T�q��");
		}
	}

	@Test
	public void homeworkTest() {
		String pattern = "([a-z[A-Z]])[1-2][1-9]{8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����Ҹ��X");
		System.out.println("�榡��J123456789");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("���T");
		} else {
			System.out.println("�п�J���T�����Ҹ��X");
		}
	}

	@Test
	public void homeworkTest1() {
		String pattern = "[CGI-Zcgi-z][1-2][1-9]{8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����Ҹ��X");
		System.out.println("�榡��J123456789");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("���T");
		} else {
			System.out.println("�п�J���T�����Ҹ��X");
		}
	}

	@Test
	public void homeworkTest2() {
		String pattern = "^[A-Za-z&&[^ABDEFHabdefh]][1-2][1-9]{8}$";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����Ҹ��X");
		System.out.println("�榡��J123456789");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("���T");
		} else {
			System.out.println("�п�J���T�����Ҹ��X");
		}
	}

	@Test
	public void regexpTest2() {
		String str = "a";
		String str1 = "Ab";
		String pattern = "\\w";
		String pattern1 = "\\w.";
		String pattern2 = "\\w.*";
		System.out.println(str.matches(pattern));
		System.out.println(str1.matches(pattern1));
		System.out.println("=====================");
		System.out.println(str.matches(pattern1));
		System.out.println(str1.matches(pattern1));
		System.out.println("=====================");
		System.out.println(str.matches(pattern2));
		System.out.println(str1.matches(pattern2));
	}

	@Test
	public void regexpTest3() {
		String str = "Hello! Java! I Love Java.";
		String pattern = "Java";
		System.out.println(str.replaceFirst(pattern, "Python"));
		System.out.println(str.replaceAll(pattern, "Python"));
		pattern = ".*(Java).*";
		System.out.println(str.replaceFirst(pattern, "Python"));
	}


}
