package com.vj.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.PersonInfo;
import com.vj.repo.IPersonJPA;


@Service
public class IPersonServiceImpl implements IPersonService {

	@Autowired
    private IPersonJPA repo;

	@Override
	public String registerPersonDetails(PersonInfo personInfo) {
		return repo.save(personInfo).getPId()+" :: Saved";
	}
	
	@Override
	public List<PersonInfo> fetchPersonInfo() {
		return repo.findAll();
	}
}
