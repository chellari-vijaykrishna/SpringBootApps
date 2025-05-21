package com.vj.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Person;
import java.util.List;



public interface IPersonRepo extends MongoRepository<Person, Integer> {
	
	public Person findByPersonId(Integer personId);
	 
}
