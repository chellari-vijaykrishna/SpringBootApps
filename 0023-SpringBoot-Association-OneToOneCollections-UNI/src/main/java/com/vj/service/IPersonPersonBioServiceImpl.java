package com.vj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.Person;
import com.vj.model.PersonBio;
import com.vj.repo.IPersonBioRepo;
import com.vj.repo.IPersonRepo;

@Service
public class IPersonPersonBioServiceImpl implements IPersonPersonBioService {
	
	@Autowired
	private IPersonRepo bookRepo;
	
	@Autowired
	private IPersonBioRepo studentRepo;

	@Override
	public String registerPersonInfo(Person person) {
		return bookRepo.save(person).getPersonId()+" : Saved";
	}

	@Override
	public String registerPersonBioInfo(PersonBio bio) {
		return studentRepo.save(bio).getBioId()+" : Saved";
	}

	
	
}
