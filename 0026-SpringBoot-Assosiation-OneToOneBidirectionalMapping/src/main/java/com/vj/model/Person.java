package com.vj.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person { //parent class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personId;
	private String personName;
	//FK created on Parent Class(person_passport)
	@OneToOne(targetEntity = Passport.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "person_passport_fkey",referencedColumnName = "passportId")
	private Passport passport;
}
