package com.vj.repo;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vj.model.Tuorist;


public interface ITuoristRepo extends MongoRepository<Tuorist, String> {
	 
	@Query(value = "{touristName:?0}")
	public List<Tuorist> findByName(String name);
	
	@Query(value = "{touristName:?0,age:?1}")
	public List<Tuorist> findByName1(String name,Float age);
	
	@Query(value = "{isVaccinated:?0,age:?1}",fields = "{touristName:1,contactNo:1}")
	public List<Object[]> findByName2(Boolean vac,Float age);
	
	@Query(value = "{isVaccinated:?0,age:?1}",sort = "{touristName:1}")
	public List<Tuorist> findByName3(Boolean vac,Float age);
	
	
}
