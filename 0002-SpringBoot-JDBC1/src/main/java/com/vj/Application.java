package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vj.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
	  ApplicationContext context = SpringApplication.run(Application.class, args);
	  
	  EmployeeRepo repo = context.getBean("emp",EmployeeRepo.class);
	  System.out.println(repo.getCount());
	}

}
