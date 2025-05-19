package com.vj.service;

import com.vj.model.PersonInformation;

public interface IPersonInfoService {
	
	
	public String registerPersonInfo(PersonInformation info);
	
	public PersonInformation fetchPersonInfo(Integer id);

}
