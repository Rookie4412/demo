package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void ifTest() {
		int a = 5;
		if (a > 5) {
			System.out.println(" -- -- \n-- - --\n--   --\n -   - \n  - -  \n   -   ");
		} else {
			System.out.println(" ++ ++ \n++ + ++\n++   ++\n +   + \n  + +  \n   +   ");
		}
	}

	@Test
	public void ifTest1() {
		int a = 5;
		if (a > 5) {
			System.out.println(" -- -- \n-- - --\n--   --\n -   - \n  - -  \n   -   ");
		} else if (a > 6) {
			System.out.println(" ++ ++ \n++ + ++\n++   ++\n +   + \n  + +  \n   +   ");
		} else {
			System.out.println(" == == \n== = ==\n==   ==\n =   = \n  = =  \n   =   ");
		}
	}

	@Test
	public void ifTest2() {
		int a = 5;
		if (a >= 5) {
			System.out.println(" -- -- \n-- - --\n--   --\n -   - \n  - -  \n   -   ");
			System.out.println(" ++ ++ \n++ + ++\n++   ++\n +   + \n  + +  \n   +   ");
		}
	}

	// switch
	@Test
	public void switchTest() {
		int a = 95;
		int b = 95 / 10; // 用浮點樹在其中一方加點零
		double c = 95.0 / 10;
		System.out.println(b);
		System.out.println(c);
	}

	@Test
	public void scannerTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String a = scan.next();
		String b = scan.next();
		System.out.println("輸入的文字是:" + a + b);

	}

	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String a = scan.nextLine();
		System.out.println("輸入的文字是:" + a);

	}

	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字");
		int a = scan.nextInt();
		System.out.println("輸入的數字是:" + a);

	}

	@Test
	public void switchTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績:");
		int input = scan.nextInt();
		switch (input / 10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
	}

	// 作業 煉金術
	@Test
	public void homeTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期:");
		String input = scan.next();
		System.out.println("幾天後:");
		int daynumber = scan.nextInt();
		int day = daynumber % 7;
		switch (input.toString()) {
		case "一":
			System.out.println("今天星期一");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期一");
				break;
			case 1:
				System.out.println(day + "天後星期二");
				break;
			case 2:
				System.out.println(day + "天後星期三");
				break;
			case 3:
				System.out.println(day + "天後星期四");
				break;
			case 4:
				System.out.println(day + "天後星期五");
				break;
			case 5:
				System.out.println(day + "天後星期六");
				break;
			case 6:
				System.out.println(day + "天後星期日");
				break;
			}
			break;
		case "二":
			System.out.println("今天星期二");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期二");
				break;
			case 1:
				System.out.println(day + "天後星期三");
				break;
			case 2:
				System.out.println(day + "天後星期四");
				break;
			case 3:
				System.out.println(day + "天後星期五");
				break;
			case 4:
				System.out.println(day + "天後星期六");
				break;
			case 5:
				System.out.println(day + "天後星期日");
				break;
			case 6:
				System.out.println(day + "天後星期一");
				break;
			}
			break;
		case "三":
			System.out.println("今天星期三");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期三");
				break;
			case 1:
				System.out.println(day + "天後星期四");
				break;
			case 2:
				System.out.println(day + "天後星期五");
				break;
			case 3:
				System.out.println(day + "天後星期六");
				break;
			case 4:
				System.out.println(day + "天後星期日");
				break;
			case 5:
				System.out.println(day + "天後星期一");
				break;
			case 6:
				System.out.println(day + "天後星期二");
				break;
			}
			break;
		case "四":
			System.out.println("今天星期四");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期四");
				break;
			case 1:
				System.out.println(day + "天後星期五");
				break;
			case 2:
				System.out.println(day + "天後星期六");
				break;
			case 3:
				System.out.println(day + "天後星期日");
				break;
			case 4:
				System.out.println(day + "天後星期一");
				break;
			case 5:
				System.out.println(day + "天後星期二");
				break;
			case 6:
				System.out.println(day + "天後星期三");
				break;
			}
			break;
		case "五":
			System.out.println("今天星期五");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期五");
				break;
			case 1:
				System.out.println(day + "天後星期六");
				break;
			case 2:
				System.out.println(day + "天後星期日");
				break;
			case 3:
				System.out.println(day + "天後星期一");
				break;
			case 4:
				System.out.println(day + "天後星期二");
				break;
			case 5:
				System.out.println(day + "天後星期三");
				break;
			case 6:
				System.out.println(day + "天後星期四");
				break;
			}
			break;
		case "六":
			System.out.println("今天星期六");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期六");
				break;
			case 1:
				System.out.println(day + "天後星期日");
				break;
			case 2:
				System.out.println(day + "天後星期一");
				break;
			case 3:
				System.out.println(day + "天後星期二");
				break;
			case 4:
				System.out.println(day + "天後星期三");
				break;
			case 5:
				System.out.println(day + "天後星期四");
				break;
			case 6:
				System.out.println(day + "天後星期五");
				break;
			}
			break;
		case "天":
			System.out.println("今天星期天");
			switch (day) {
			case 0:
				System.out.println(day + "天後星期日");
				break;
			case 1:
				System.out.println(day + "天後星期一");
				break;
			case 2:
				System.out.println(day + "天後星期二");
				break;
			case 3:
				System.out.println(day + "天後星期三");
				break;
			case 4:
				System.out.println(day + "天後星期四");
				break;
			case 5:
				System.out.println(day + "天後星期五");
				break;
			case 6:
				System.out.println(day + "天後星期六");
				break;
			}
			break;
		default:
			System.out.println("請輸入(中文)的日期");
		}

	}

	// 有想法
	@Test
	public void homeTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期:");
		String input = scan.next();
		System.out.println("幾天後:");
		int daynumber = scan.nextInt();
		int a = 0;
		switch (input) {
		case "一":
			System.out.println("今天星期一");
			a = 1;
			break;
		case "二":
			System.out.println("今天星期二");
			a = 2;
			break;
		case "三":
			System.out.println("今天星期三");
			a = 3;
			break;
		case "四":
			System.out.println("今天星期四");
			a = 4;
			break;
		case "五":
			System.out.println("今天星期五");
			a = 5;
			break;
		case "六":
			System.out.println("今天星期六");
			a = 6;
			break;
		case "天":
			System.out.println("今天星期天");
			a = 7;
			break;
		default:
			System.out.println("請輸入(中文)的日期");
		}
		int auto = (a + daynumber) % 7;
		switch (auto) {
		case 1:
			System.out.println(daynumber + "天後星期一");
			break;
		case 2:
			System.out.println(daynumber + "天後星期二");
			break;
		case 3:
			System.out.println(daynumber + "天後星期三");
			break;
		case 4:
			System.out.println(daynumber + "天後星期四");
			break;
		case 5:
			System.out.println(daynumber + "天後星期五");
			break;
		case 6:
			System.out.println(daynumber + "天後星期六");
			break;
		case 0:
			System.out.println(daynumber + "天後星期天");
			break;
		}
	}

	// 老師教學
	@Test
	public void homeTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期:");
		String input = scan.next();
		int day = 0;
		switch (input) {
		case "一":
			day = 1;
			break;
		case "二":
			day = 2;
			break;
		case "三":
			day = 3;
			break;
		case "四":
			day = 4;
			break;
		case "五":
			day = 5;
			break;
		case "六":
			day = 6;
			break;
		case "日":
		case "天":
			day = 7;
			break;
		default:
			System.out.println("請輸入(中文)的日期");
		}
		System.out.println("幾天後:");
		int daynumber = scan.nextInt();
		switch ((day + daynumber) % 7) {
		case 1:
			System.out.printf("今天星期%s,%d後是星期一", input, daynumber);
			break;
		case 2:
			System.out.printf("今天星期%s,%d後是星期二", input, daynumber);
			break;
		case 3:
			System.out.printf("今天星期%s,%d後是星期三", input, daynumber);
			break;
		case 4:
			System.out.printf("今天星期%s,%d後是星期四", input, daynumber);
			break;
		case 5:
			System.out.printf("今天星期%s,%d後是星期五", input, daynumber);
			break;
		case 6:
			System.out.printf("今天星期%s,%d後是星期六", input, daynumber);
			break;
		case 0:
			System.out.printf("今天星期%s,%d後是星期日", input, daynumber);
			break;
		}
		System.out.printf("今天星期%s,%d後是星期%s", input, daynumber, input);

	}

	// 數字轉中文
	@Test
	public void homeTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期:");
		
		int inputInt = scan.nextInt();
		String weekday = switchDay(inputInt); 
		
		System.out.println("幾天後:");
		int day = scan.nextInt(); 
		
		String output = switchDay((day + inputInt) % 7);
		System.out.printf("今天星期%s,%d後是星期%s", weekday, day, output);
	}
	// 參數傳遞
	// void 改字串 所以void 改成 String
	public String switchDay(int inputInt) {
		// 要初始化給weekday空值
		String weekday = "";
		switch (inputInt) {
		case 1:
			weekday = "一";
			break;
		case 2:
			weekday = "二";
			break;
		case 3:
			weekday = "三";
			break;
		case 4:
			weekday = "四";
			break;
		case 5:
			weekday = "五";
			break;
		case 6:
			weekday = "六";
			break;
		case 7:
			weekday = "日";
			break;
		}
		//要加 return 回傳我們要的weekday值
		return weekday;
	}
	
}
