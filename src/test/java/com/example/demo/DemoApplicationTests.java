package com.example.demo;

import org.junit.jupiter.api.Test;

//@SpringBootTest
public class DemoApplicationTests {
	// @Test�Q���յ��G�i�[�J�o��
	// public�v��
	// void: �^�Ǹ�ƫ��A�����^�ǥ���� , @Test���^�ǳ��Ovoid��~~~
	// firstTest��k�W��(�i����):�p�A��()���i�H�a�Ѽ� ,�j�A��{}���O�޿�϶�
	@Test
	public void firstTest() {
		int a = 1234567891;
		// java���w�]��ƾ�ƬOint�ҥH�n�b���[�J�jOR�p�gL
		long b = 1234567891132L;
		System.out.println(a);
//		String str = new String("ABC");
		String str = "123";
		String str1 = "ABC";
		System.out.println(str + str1);

	}

}
