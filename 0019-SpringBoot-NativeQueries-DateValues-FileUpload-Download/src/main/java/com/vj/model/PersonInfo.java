package com.vj.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PersonInfo {
	@Id
	@GeneratedValue
	private Integer pId;
	private String pName;
	private Integer pAge;
	private LocalDate pDob;
	private LocalTime pBot;
	private LocalDateTime pDTom;
}
