package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.PersonInfo;

@Repository
public interface IPersonJPA extends JpaRepository<PersonInfo, Integer> {
	
	
	
}
