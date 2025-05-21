package com.vj.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private String id;
	private Integer studId;
	private String studName;
	private String studSection;
	private Integer studSubjectCount;
}
