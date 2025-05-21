package com.vj.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Sport;


public interface ISportRepo extends MongoRepository<Sport, Integer> {
	 
}
