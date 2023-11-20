package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// 排除 Spring Boot Security的預設登錄頁面
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

////		基本資料型態			
		Scanner scan = new Scanner(System.in);
		int x, y;
		String str;
		x = scan.nextInt();
		y = scan.nextInt();
		str = scan.next();
		System.out.println(x + "\t" + y + "\t" + str);
	}

}
