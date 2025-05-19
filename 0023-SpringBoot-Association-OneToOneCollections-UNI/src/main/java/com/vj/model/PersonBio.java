package com.vj.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonBio {
	
	@Id
	private Integer bioId;
	private String bioDesc;
	
	@OneToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkey")
	private Person person;
}
