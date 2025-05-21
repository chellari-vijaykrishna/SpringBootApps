package com.vj.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersonInfo { //parent class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personId;
	private String personName;
	//FK created on Child Class(personinfo_hobbie_fk)
	@OneToMany(targetEntity = Hobbies.class,cascade = CascadeType.MERGE)
	@JoinColumn(name = "personinfo_hobbie_fk",referencedColumnName = "personId")
	private Set<Hobbies> hobbies;
}
