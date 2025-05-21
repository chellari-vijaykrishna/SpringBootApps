package com.vj.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Person;


public interface IPersonRepo extends MongoRepository<Person, Integer> {
	 
}
