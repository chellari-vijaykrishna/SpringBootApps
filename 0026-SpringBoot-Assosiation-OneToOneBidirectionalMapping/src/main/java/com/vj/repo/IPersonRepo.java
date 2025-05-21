package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vj.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {
	
	//HQL Queries are joined based on field values
	@Query("SELECT P.personId,P.personName,PS.passportId,PS.passportNumber FROM Person P INNER JOIN P.passport PS")
	//@Query("SELECT P.personId,P.personName,PS.passportId,PS.passportNumber FROM Person P LEFT JOIN P.passport PS")
	//@Query("SELECT P.personId,P.personName,PS.passportId,PS.passportNumber FROM Person P RIGHT JOIN P.passport PS")
	//@Query("SELECT P.personId,P.personName,PS.passportId,PS.passportNumber FROM Person P JOIN P.passport PS")
	//Full Join Not Supported by MYSQL
	//@Query("SELECT P.personId,P.personName,PS.passportId,PS.passportNumber FROM Person P FULL JOIN P.passport PS")
	public List<Object[]> joinsColumns();

}
