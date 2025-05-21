package com.vj.runner;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.PersonInfo;
import com.vj.repo.IPersonInfoRepo;

@Component
public class CommonLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IPersonInfoRepo repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started...!!!");

//		PersonInfo personInfo = new PersonInfo();
//		Integer inVal = new Random().nextInt(1000000);
//		personInfo.setPersonId(inVal);
//		personInfo.setPersonName("Vijay");
//		personInfo.setPersonFavColours(new String[] {"Red,Blue,Black"});
//		personInfo.setPersonFriends(List.of("Krishna", "Ram", "Challari"));
//		personInfo.setPersonPhoneNumbers(Set.of(9381471084L, 7036543405L, 9985124332L));
//		personInfo.setPersonCards(Map.of("Aadhar", "6465564848465", "Voter", "A278499P", "Passport", "IN9308747"));
//		repo.save(personInfo);	
//		System.out.println("Created");
//		
		//repo.deleteByPersonId(487759);
//		
		PersonInfo personInfoo = repo.findByPersonId(401926);
		
		
		Integer id = personInfoo.getPersonId();
		
		String name = personInfoo.getPersonName();
		String [] ar = personInfoo.getPersonFavColours();
		List<String> list = personInfoo.getPersonFriends();
		Set<Long> longs = personInfoo.getPersonPhoneNumbers();
		Map<String,String> map = personInfoo.getPersonCards();
		
		
		System.out.println(id);
		System.out.println(name);
		
		for(String s:ar) {
			System.out.println(s);
		}
		list.forEach(element->{
			System.out.println(element);
		});
		longs.forEach(set->{
			System.out.println(set);
		});
		map.forEach((m,p)->{
			System.out.println(m+" ::"+p);
		});
		
		
	}

}
