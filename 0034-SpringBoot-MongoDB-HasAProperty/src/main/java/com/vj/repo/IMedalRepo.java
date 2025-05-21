package com.vj.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Medal;


public interface IMedalRepo extends MongoRepository<Medal, Integer> {
	 
}
