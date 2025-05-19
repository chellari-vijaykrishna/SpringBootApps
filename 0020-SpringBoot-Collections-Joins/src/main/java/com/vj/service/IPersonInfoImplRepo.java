package com.vj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.PersonInformation;
import com.vj.repo.IPersonInfoRepo;

@Service
public class IPersonInfoImplRepo implements IPersonInfoService {
	
	@Autowired
	private IPersonInfoRepo repo;

	@Override
	public String registerPersonInfo(PersonInformation info) {		
		return repo.save(info).getPersonId()+" :: SAVED";
	}

	@Override
	public PersonInformation fetchPersonInfo(Integer id) {
		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Id Not Found"));
	}

	
}
