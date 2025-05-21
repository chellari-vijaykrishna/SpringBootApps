package com.vj.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Passport;


public interface IPassportRepo extends MongoRepository<Passport, String> {
	 
}
