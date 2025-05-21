package com.vj.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.PersonInfo;


public interface IPersonInfoRepo extends MongoRepository<PersonInfo, String> {
	 public void deleteByPersonId(Integer id);
	 
	 public PersonInfo findByPersonId(Integer id);
	 
	 
}
