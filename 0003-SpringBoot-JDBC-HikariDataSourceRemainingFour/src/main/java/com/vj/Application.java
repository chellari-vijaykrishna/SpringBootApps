package com.vj;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.vj.repo.EmployeeRepo;

@SpringBootApplication
public class Application {
	
	/*
	 * @Bean public DataSource createDs() throws Exception { 
	 * ComboPooledDataSource s = new ComboPooledDataSource();
	 * s.setDriverClass("oracle.jdbc.driver.OracleDriver");
	 * s.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
	 * s.setUser("system");
	 * s.setPassword("vijay");
	 * return s;
	 * }
	 */

	public static void main(String[] args) throws Exception {
	  ApplicationContext context = SpringApplication.run(Application.class, args);
	  
	  EmployeeRepo repo = context.getBean("emp",EmployeeRepo.class);
	  System.out.println(repo.getCount());
	}

}
