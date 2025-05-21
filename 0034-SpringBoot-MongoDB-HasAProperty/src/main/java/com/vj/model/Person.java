package com.vj.model;

import java.util.Map;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Person {
	@Id
	private Integer personId;
	private String personName;
	
	private Set<Sport> sports;
	
	private Map<String,Medal> medals;

}
