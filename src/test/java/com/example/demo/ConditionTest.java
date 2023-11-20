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
		int b = 95 / 10; // �ίB�I��b�䤤�@��[�I�s
		double c = 95.0 / 10;
		System.out.println(b);
		System.out.println(c);
	}

	@Test
	public void scannerTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��r");
		String a = scan.next();
		String b = scan.next();
		System.out.println("��J����r�O:" + a + b);

	}

	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��r");
		String a = scan.nextLine();
		System.out.println("��J����r�O:" + a);

	}

	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�Ʀr");
		int a = scan.nextInt();
		System.out.println("��J���Ʀr�O:" + a);

	}

	@Test
	public void switchTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���Z:");
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

	// �@�~ �Ҫ��N
	@Test
	public void homeTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("���ѬP��:");
		String input = scan.next();
		System.out.println("�X�ѫ�:");
		int daynumber = scan.nextInt();
		int day = daynumber % 7;
		switch (input.toString()) {
		case "�@":
			System.out.println("���ѬP���@");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P���@");
				break;
			case 1:
				System.out.println(day + "�ѫ�P���G");
				break;
			case 2:
				System.out.println(day + "�ѫ�P���T");
				break;
			case 3:
				System.out.println(day + "�ѫ�P���|");
				break;
			case 4:
				System.out.println(day + "�ѫ�P����");
				break;
			case 5:
				System.out.println(day + "�ѫ�P����");
				break;
			case 6:
				System.out.println(day + "�ѫ�P����");
				break;
			}
			break;
		case "�G":
			System.out.println("���ѬP���G");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P���G");
				break;
			case 1:
				System.out.println(day + "�ѫ�P���T");
				break;
			case 2:
				System.out.println(day + "�ѫ�P���|");
				break;
			case 3:
				System.out.println(day + "�ѫ�P����");
				break;
			case 4:
				System.out.println(day + "�ѫ�P����");
				break;
			case 5:
				System.out.println(day + "�ѫ�P����");
				break;
			case 6:
				System.out.println(day + "�ѫ�P���@");
				break;
			}
			break;
		case "�T":
			System.out.println("���ѬP���T");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P���T");
				break;
			case 1:
				System.out.println(day + "�ѫ�P���|");
				break;
			case 2:
				System.out.println(day + "�ѫ�P����");
				break;
			case 3:
				System.out.println(day + "�ѫ�P����");
				break;
			case 4:
				System.out.println(day + "�ѫ�P����");
				break;
			case 5:
				System.out.println(day + "�ѫ�P���@");
				break;
			case 6:
				System.out.println(day + "�ѫ�P���G");
				break;
			}
			break;
		case "�|":
			System.out.println("���ѬP���|");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P���|");
				break;
			case 1:
				System.out.println(day + "�ѫ�P����");
				break;
			case 2:
				System.out.println(day + "�ѫ�P����");
				break;
			case 3:
				System.out.println(day + "�ѫ�P����");
				break;
			case 4:
				System.out.println(day + "�ѫ�P���@");
				break;
			case 5:
				System.out.println(day + "�ѫ�P���G");
				break;
			case 6:
				System.out.println(day + "�ѫ�P���T");
				break;
			}
			break;
		case "��":
			System.out.println("���ѬP����");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P����");
				break;
			case 1:
				System.out.println(day + "�ѫ�P����");
				break;
			case 2:
				System.out.println(day + "�ѫ�P����");
				break;
			case 3:
				System.out.println(day + "�ѫ�P���@");
				break;
			case 4:
				System.out.println(day + "�ѫ�P���G");
				break;
			case 5:
				System.out.println(day + "�ѫ�P���T");
				break;
			case 6:
				System.out.println(day + "�ѫ�P���|");
				break;
			}
			break;
		case "��":
			System.out.println("���ѬP����");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P����");
				break;
			case 1:
				System.out.println(day + "�ѫ�P����");
				break;
			case 2:
				System.out.println(day + "�ѫ�P���@");
				break;
			case 3:
				System.out.println(day + "�ѫ�P���G");
				break;
			case 4:
				System.out.println(day + "�ѫ�P���T");
				break;
			case 5:
				System.out.println(day + "�ѫ�P���|");
				break;
			case 6:
				System.out.println(day + "�ѫ�P����");
				break;
			}
			break;
		case "��":
			System.out.println("���ѬP����");
			switch (day) {
			case 0:
				System.out.println(day + "�ѫ�P����");
				break;
			case 1:
				System.out.println(day + "�ѫ�P���@");
				break;
			case 2:
				System.out.println(day + "�ѫ�P���G");
				break;
			case 3:
				System.out.println(day + "�ѫ�P���T");
				break;
			case 4:
				System.out.println(day + "�ѫ�P���|");
				break;
			case 5:
				System.out.println(day + "�ѫ�P����");
				break;
			case 6:
				System.out.println(day + "�ѫ�P����");
				break;
			}
			break;
		default:
			System.out.println("�п�J(����)�����");
		}

	}

	// ���Q�k
	@Test
	public void homeTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ѬP��:");
		String input = scan.next();
		System.out.println("�X�ѫ�:");
		int daynumber = scan.nextInt();
		int a = 0;
		switch (input) {
		case "�@":
			System.out.println("���ѬP���@");
			a = 1;
			break;
		case "�G":
			System.out.println("���ѬP���G");
			a = 2;
			break;
		case "�T":
			System.out.println("���ѬP���T");
			a = 3;
			break;
		case "�|":
			System.out.println("���ѬP���|");
			a = 4;
			break;
		case "��":
			System.out.println("���ѬP����");
			a = 5;
			break;
		case "��":
			System.out.println("���ѬP����");
			a = 6;
			break;
		case "��":
			System.out.println("���ѬP����");
			a = 7;
			break;
		default:
			System.out.println("�п�J(����)�����");
		}
		int auto = (a + daynumber) % 7;
		switch (auto) {
		case 1:
			System.out.println(daynumber + "�ѫ�P���@");
			break;
		case 2:
			System.out.println(daynumber + "�ѫ�P���G");
			break;
		case 3:
			System.out.println(daynumber + "�ѫ�P���T");
			break;
		case 4:
			System.out.println(daynumber + "�ѫ�P���|");
			break;
		case 5:
			System.out.println(daynumber + "�ѫ�P����");
			break;
		case 6:
			System.out.println(daynumber + "�ѫ�P����");
			break;
		case 0:
			System.out.println(daynumber + "�ѫ�P����");
			break;
		}
	}

	// �Ѯv�о�
	@Test
	public void homeTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ѬP��:");
		String input = scan.next();
		int day = 0;
		switch (input) {
		case "�@":
			day = 1;
			break;
		case "�G":
			day = 2;
			break;
		case "�T":
			day = 3;
			break;
		case "�|":
			day = 4;
			break;
		case "��":
			day = 5;
			break;
		case "��":
			day = 6;
			break;
		case "��":
		case "��":
			day = 7;
			break;
		default:
			System.out.println("�п�J(����)�����");
		}
		System.out.println("�X�ѫ�:");
		int daynumber = scan.nextInt();
		switch ((day + daynumber) % 7) {
		case 1:
			System.out.printf("���ѬP��%s,%d��O�P���@", input, daynumber);
			break;
		case 2:
			System.out.printf("���ѬP��%s,%d��O�P���G", input, daynumber);
			break;
		case 3:
			System.out.printf("���ѬP��%s,%d��O�P���T", input, daynumber);
			break;
		case 4:
			System.out.printf("���ѬP��%s,%d��O�P���|", input, daynumber);
			break;
		case 5:
			System.out.printf("���ѬP��%s,%d��O�P����", input, daynumber);
			break;
		case 6:
			System.out.printf("���ѬP��%s,%d��O�P����", input, daynumber);
			break;
		case 0:
			System.out.printf("���ѬP��%s,%d��O�P����", input, daynumber);
			break;
		}
		System.out.printf("���ѬP��%s,%d��O�P��%s", input, daynumber, input);

	}

	// �Ʀr�त��
	@Test
	public void homeTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ѬP��:");
		
		int inputInt = scan.nextInt();
		String weekday = switchDay(inputInt); 
		
		System.out.println("�X�ѫ�:");
		int day = scan.nextInt(); 
		
		String output = switchDay((day + inputInt) % 7);
		System.out.printf("���ѬP��%s,%d��O�P��%s", weekday, day, output);
	}
	// �Ѽƶǻ�
	// void ��r�� �ҥHvoid �令 String
	public String switchDay(int inputInt) {
		// �n��l�Ƶ�weekday�ŭ�
		String weekday = "";
		switch (inputInt) {
		case 1:
			weekday = "�@";
			break;
		case 2:
			weekday = "�G";
			break;
		case 3:
			weekday = "�T";
			break;
		case 4:
			weekday = "�|";
			break;
		case 5:
			weekday = "��";
			break;
		case 6:
			weekday = "��";
			break;
		case 7:
			weekday = "��";
			break;
		}
		//�n�[ return �^�ǧڭ̭n��weekday��
		return weekday;
	}
	
}
