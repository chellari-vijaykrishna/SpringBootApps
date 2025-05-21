package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vj.model.Hobbies;

public interface IHobbieRepo extends JpaRepository<Hobbies, Integer> {

	@Query("SELECT p.personId, p.personName, h.hobbieId, h.hobbieTypeName FROM Hobbies h LEFT JOIN h.info p")
	public List<Object[]> joinColumns();

}
