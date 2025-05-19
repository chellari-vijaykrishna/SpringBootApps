package com.vj;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vj.wish.WishClass;

@SpringBootApplication
public class Application {
	
	@Bean
	public Date getDate() {
		return new Date();
	}

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("App Started::: ");
		/*
		 * WishClass clazz = new WishClass(); System.out.println(clazz.wishApp());
		 */
		WishClass clazz = context.getBean("wishClass",WishClass.class);
		System.out.println(clazz.wishApp());
	}

}
