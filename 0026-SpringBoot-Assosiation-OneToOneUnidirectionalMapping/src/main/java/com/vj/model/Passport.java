package com.vj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passport { //Child Class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passportId;
	@Column(unique = true)
	private String passportNumber;
	
}
