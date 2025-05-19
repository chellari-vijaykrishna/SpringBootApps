package com.vj.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-20)
public class RunnerClass implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Application Runner Exectuting.....!");
		//System.out.println("RunnerClass.run()1");
		
		 System.out.println(args.getOptionNames());
		 System.out.println(args.getNonOptionArgs());
		 System.out.println(args.getOptionValues("name"));
		 
			/*
			 * ApplicationRunner runner = arg->{ System.out.println(arg.getNonOptionArgs());
			 * System.out.println(arg.getOptionNames()); };
			 */
		 
	}

}
