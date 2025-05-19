package com.vj.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
//@Component
@Order(0)
public class ARunnerCR implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ARunnerCR.run()3");
	}

}
