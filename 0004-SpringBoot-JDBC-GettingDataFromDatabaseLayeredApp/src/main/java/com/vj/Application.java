package com.vj;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vj.controller.EmployeesController;
import com.vj.model.Employees;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeesController controller = context.getBean("empController",EmployeesController.class);
		List<String> str = List.of("HR", "IT", "SALES");
		
		str.forEach(emp -> {
			System.out.println(emp.toString());
		});
		
		List<Employees> emplist = controller.getDsngs(str);
		emplist.forEach(emp -> {
			System.out.println(emp.toString());
		});
	}

}
