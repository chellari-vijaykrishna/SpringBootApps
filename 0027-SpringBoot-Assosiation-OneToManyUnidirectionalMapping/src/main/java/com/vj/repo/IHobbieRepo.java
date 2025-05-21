package com.vj.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.vj.model.Hobbies;

public interface IHobbieRepo extends JpaRepository<Hobbies, Integer> {
	
	

}
