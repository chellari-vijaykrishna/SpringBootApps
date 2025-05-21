package com.vj.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.Application;
import com.vj.model.Medal;
import com.vj.model.Person;
import com.vj.model.Sport;
import com.vj.repo.IMedalRepo;
import com.vj.repo.IPersonRepo;
import com.vj.repo.ISportRepo;


@Component
public class CommonLineRunnerClass implements CommandLineRunner {

    private final Application application;

	@Autowired
	private IPersonRepo perRepo;

	@Autowired
	private IMedalRepo medRepo;
	
	@Autowired
	private ISportRepo spoRepo;

    CommonLineRunnerClass(Application application) {
        this.application = application;
    }
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started...!!!");
		
//		Sport sport1 = new Sport(new Random().nextInt(10000), "Cricket");
//		Sport sport2 = new Sport(new Random().nextInt(10000), "Hocky");
//		Sport sport3 = new Sport(new Random().nextInt(10000), "Kabaddi");
//		
//		
//		Medal medal1 = new Medal(new Random().nextInt(10000), "Gold"); 
//		Medal medal2 = new Medal(new Random().nextInt(10000), "Silver"); 
//		Medal medal3 = new Medal(new Random().nextInt(10000), "Bronge"); 
//		Medal medal4 = new Medal(new Random().nextInt(10000), "Diamond"); 
//		
//		
//		Person person = new Person(new Random().nextInt(10000), "Vijay", 
//				
//				
//				Set.of(sport1, sport2,sport3), 
//				
//				
//				Map.of("Gold", medal1,"Silver", medal2,"Bronge", medal3,"Diamond", medal4)
//				
//				);
//				
//		
//		
//		perRepo.save(person);
		
		
		Person per =perRepo.findByPersonId(6379);
				
				System.out.println(per.toString());
		
	}

}
