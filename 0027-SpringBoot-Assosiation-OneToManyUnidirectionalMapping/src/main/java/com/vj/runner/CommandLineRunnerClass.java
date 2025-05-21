package com.vj.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.Hobbies;
import com.vj.model.PersonInfo;
import com.vj.repo.IHobbieRepo;
import com.vj.repo.IPersonInfoRepo;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	
	@Autowired
	private IHobbieRepo hobbieRepo;
	
	@Autowired
	private IPersonInfoRepo personInfoRepo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.......!!");
		
		
//		Hobbies hobbies = new Hobbies();
//		hobbies.setHobbieTypeName("Technical");	
//		hobbieRepo.save(hobbies);
//		
//		
//		PersonInfo info = new PersonInfo();
//		info.setPersonName("Vijay");
//		info.setHobbies(Set.of(hobbies));
//		personInfoRepo.save(info);
		

		System.out.println("Retrive");

		List<Object[]> ar = personInfoRepo.joinColumns();
		System.out.println(ar.toString());

		for (Object[] s : ar) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}

}
