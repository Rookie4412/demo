package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// �ư� Spring Boot Security���w�]�n������
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

////		�򥻸�ƫ��A			
		Scanner scan = new Scanner(System.in);
		int x, y;
		String str;
		x = scan.nextInt();
		y = scan.nextInt();
		str = scan.next();
		System.out.println(x + "\t" + y + "\t" + str);
	}

}
