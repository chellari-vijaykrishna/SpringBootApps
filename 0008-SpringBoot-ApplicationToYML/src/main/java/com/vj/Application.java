package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vj.values.ValueClass;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		ValueClass valueClass = context.getBean("valueClass", ValueClass.class);

		System.out.println(valueClass.toString());

	}

}
