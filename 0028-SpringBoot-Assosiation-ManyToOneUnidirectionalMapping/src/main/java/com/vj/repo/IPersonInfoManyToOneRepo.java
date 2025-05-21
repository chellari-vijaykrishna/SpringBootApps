package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vj.model.PersonInfoManyToOne;

public interface IPersonInfoManyToOneRepo extends JpaRepository<PersonInfoManyToOne, Integer> {

	
	@Query("select h.hobbieId,h.hobbieTypeName,p.personId,p.personName from HobbiesManyToOne h Join h.info p")
	public List<Object[]> joinColumns();

}
