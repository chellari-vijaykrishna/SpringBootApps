package com.vj.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo {
	@Id
	private String id;
	@Indexed(unique = true)
	private Integer personId;
	private String personName;
	private String [] personFavColours;
	private List<String> personFriends = new ArrayList<String>();
	private Set<Long> personPhoneNumbers = new HashSet<Long>();
	private Map<String,String> personCards = new HashMap<String, String>();
}
