package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegxpTest {
	// 手機電話
	@Test
	public void regxpTest() {
		String str = "0912-345-678";
		// 這個 \ 不能單獨存在他是有意義的 ，第一個斜線\代表跳脫字元 ，第二個斜線 \ 會讓第一個斜線變成無意義的
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d"; // \\d = d代表數字的意思
		System.out.println(str.matches(pattern));
		System.out.println("=====================");
		String pattern2 = "\\d{4}-\\d{3}-\\d{3}"; // 也可以使用這種方式
		System.out.println(str.matches(pattern2));
		System.out.println("=====================");
		String pattern3 = "\\d{4}(-\\d{3}){2}"; // 也可以使=用這種方式
		System.out.println(str.matches(pattern3));
	}

	// 市內電話
	@Test
	public void regxpTest1() {
//		String pattern = "(\\d{2})\\d{8}"; // 格式(2碼)8碼，不包含小括號 ;小括號只有分組用
		String pattern = "\\(\\d{2}\\)\\d{8}"; // 格式(2碼)8碼，包含小括號
	}

	@Test
	public void regxpTest2() {
		String patternA = "\\(\\d{2}\\)\\d{8}";
		String patternB = "\\(\\d{2}\\)\\d{7}";
		// 水管整合用法 patternA，B == pattern1，2 效果一樣 可挑看喜愛的使用
		String pattern = "\\(\\d{2}\\)(\\d{7}|\\d{8})"; // (02)12345678 or (02)1234567
		String pattern1 = "\\(\\d{2}\\)\\d{7}||\\(\\d\\)\\d{8}";
		String pattern2 = "(\\d{2})-\\d{8}";
		String pattern3 = "(\\d{2})-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市內電話");
		System.out.println("電話格式為(02)12345678 或 (02)1234567");
		System.out.println("電話格式為02-12345678 或 02-1234567");
		String str = scan.next();
		if (str.matches(pattern) || str.matches(pattern1) || str.matches(pattern2) || str.matches(pattern3)) {
			System.out.println("正確電話");
		} else {
			System.out.println("請輸入正確電話");
		}
	}

	@Test
	public void regxpTest3() {
		String patternA = "\\(\\d{2}\\)\\d{7,8}";
		String pattern3 = "(\\d{2})-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市內電話");
		System.out.println("電話格式為(02)12345678 或 (02)1234567");
		System.out.println("電話格式為02-12345678 或 02-1234567");
		String str = scan.next();
		if (str.matches(patternA) || str.matches(pattern3)) {
			System.out.println("正確電話");
		} else {
			System.out.println("請輸入正確電話");
		}
	}

	// 全台電話
	@Test
	public void regxpTest5() {
		// 總和方法
		String pattern = "(\\(\\d{2,4}\\)||\\d{2,4}-)\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市內電話");
		System.out.println("電話格式為(02)12345678 或 (02)1234567");
		System.out.println("電話格式為02-12345678 或 02-1234567");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("正確電話");
		} else {
			System.out.println("請輸入正確電話");
		}
	}

	@Test
	public void regxpTest6() {
		String pattern = "0\\d{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市內電話");
		System.out.println("電話格式為02-12345678");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("正確電話");
		} else {
			System.out.println("請輸入正確電話");
		}
	}

	@Test
	public void regxpTest7() {
		String pattern = "0[1-9]{1,3}-[0-9]{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市內電話");
		System.out.println("電話格式為02-12345678");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("正確電話");
		} else {
			System.out.println("請輸入正確電話");
		}
	}

	@Test
	public void homeworkTest() {
		String pattern = "([a-z[A-Z]])[1-2][1-9]{8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入身分證號碼");
		System.out.println("格式為J123456789");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("正確");
		} else {
			System.out.println("請輸入正確身分證號碼");
		}
	}

	@Test
	public void homeworkTest1() {
		String pattern = "[CGI-Zcgi-z][1-2][1-9]{8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入身分證號碼");
		System.out.println("格式為J123456789");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("正確");
		} else {
			System.out.println("請輸入正確身分證號碼");
		}
	}

	@Test
	public void homeworkTest2() {
		String pattern = "^[A-Za-z&&[^ABDEFHabdefh]][1-2][1-9]{8}$";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入身分證號碼");
		System.out.println("格式為J123456789");
		String str = scan.next();
		if (str.matches(pattern)) {
			System.out.println("正確");
		} else {
			System.out.println("請輸入正確身分證號碼");
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
