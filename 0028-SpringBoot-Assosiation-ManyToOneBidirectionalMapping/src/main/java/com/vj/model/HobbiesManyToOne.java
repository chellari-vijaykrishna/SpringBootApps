package com.vj.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HobbiesManyToOne { //child class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hobbieId;
	private String hobbieTypeName;
	
	@ManyToOne(targetEntity = PersonInfoManyToOne.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "hobbie_personinfo_fkey",referencedColumnName = "personId")
	private PersonInfoManyToOne info;
}
