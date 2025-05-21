package com.vj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passport { //child class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passportId;
	private String passportNumber;
	
	// 'passport' refers to the property in the User class(ONETOONE Mapped filed)
	@OneToOne(targetEntity = Person.class,mappedBy = "passport")
	private Person person;
	
}
