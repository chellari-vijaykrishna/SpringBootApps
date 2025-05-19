package com.vj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.Person;
import com.vj.model.PersonBio;
import com.vj.service.IPersonPersonBioService;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IPersonPersonBioService service;

	@Override
	public void run(String... args) throws Exception {

		Person person = new Person();
		person.setPersonId(1);
		person.setPersonName("Vijay");
		
		service.registerPersonInfo(person);
		
		PersonBio bio = new PersonBio();
		bio.setBioId(1);
		bio.setBioDesc("Nenu Vijay");
		bio.setPerson(person);
		service.registerPersonBioInfo(bio);
	}

}
