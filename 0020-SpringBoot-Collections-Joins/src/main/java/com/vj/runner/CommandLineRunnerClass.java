package com.vj.runner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.PersonInformation;
import com.vj.service.IPersonInfoService;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IPersonInfoService service;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Runner Started....!!");
//		List<String> personFrds = List.of("Imran", "Chandrika", "Jannu");
//		Set<String> personCons = Set.of("9381471084","7036543405","7382717619");
//		Map<String, String> personCards = new HashMap<String, String>();
//		personCards.put("Aadhar Card", "123668464164");
//		personCards.put("Pan Card", "BSHPC4545O");
//		personCards.put("Voter Card", "BH265515V");		
//		PersonInformation info = new PersonInformation("Chellari Vijay Krishna", personFrds, personCons, personCards);
//		service.registerPersonInfo(info);
		
		PersonInformation personInformation =service.fetchPersonInfo(1);
		
		System.out.println(personInformation.toString());

	}

}
