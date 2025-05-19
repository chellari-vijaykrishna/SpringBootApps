package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vj.values.ValueClassConfigProperties;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		/*
		 * ValueClass valueClass = context.getBean("valueClass", ValueClass.class);
		 * 
		 * System.out.println(valueClass.getValues());
		 * System.out.println(valueClass.getValuesforInput());
		 * System.out.println(valueClass.getValuesforSystemProps());
		 */
		ValueClassConfigProperties valueClass1 = context.getBean("valueClassProperties", ValueClassConfigProperties.class);

		System.out.println(valueClass1.toString());

	}

}
