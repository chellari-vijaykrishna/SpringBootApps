package com.vj.wish;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishClass {
	
	@Autowired
	private Date date;
	
	public String wishApp() {
		return "Wishing You:: !!"+date;
	}

}
