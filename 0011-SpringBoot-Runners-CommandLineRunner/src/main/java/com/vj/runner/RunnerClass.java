package com.vj.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerClass implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner is Executuing.....!!");
		System.out.println(Arrays.toString(args));

	}

}
