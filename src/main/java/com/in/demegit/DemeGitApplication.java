package com.in.demegit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemeGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemeGitApplication.class, args);
		System.out.println("this is testing purpose....");

		for (int i=0;i<10;i++)
		{
			System.out.println(i);
		}

	}

}
