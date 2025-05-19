package com.vj.service;

import java.util.List;

import com.vj.model.PersonInfo;

public interface IPersonService {
	public String registerPersonDetails(PersonInfo personInfo);
	public List<PersonInfo> fetchPersonInfo();
}
