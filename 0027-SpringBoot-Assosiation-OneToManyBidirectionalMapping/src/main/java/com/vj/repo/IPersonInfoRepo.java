package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vj.model.PersonInfo;

public interface IPersonInfoRepo extends JpaRepository<PersonInfo, Integer> {
	
	
	@Query("SELECT p.personId, p.personName, h.hobbieId, h.hobbieTypeName FROM PersonInfo p LEFT JOIN p.hobbies h")
	public List<Object[]> joinColumns();

}
