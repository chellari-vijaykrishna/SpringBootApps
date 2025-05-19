package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class IMovieServiceImpl implements IMovieService {

	@Autowired
	private EntityManager manager;

	@Override
	public List<Employee> callProcedures(String jobOne, String jobTwo) {
		StoredProcedureQuery query = manager.createStoredProcedureQuery("GetEmployeesByDesignation", Employee.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.setParameter(1, jobOne);
		query.setParameter(2, jobTwo);
		//query.execute();
		@SuppressWarnings("unchecked")
		List<Employee> emp = query.getResultList();
		return emp;
	}
	@Override
	public Integer countAll() {
		//StoredProcedureQuery query = manager.createStoredProcedureQuery("COUNTPRO", Integer.class);
		StoredProcedureQuery queryy = manager.createStoredProcedureQuery("COUNTPRO");
		
		
//		queryy.registerStoredProcedureParameter("c", Integer.class,ParameterMode.OUT);
//		queryy.execute();
//		Integer resultt =(Integer) queryy.getOutputParameterValue("c");	
		queryy.registerStoredProcedureParameter(1, Integer.class,ParameterMode.OUT);
		queryy.execute();
		Integer result =(Integer) queryy.getOutputParameterValue(1);
		return result;
	}

}
