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
public class Movie {
	@Id
	private Integer movieId;
	private String movieName;
	private String movieGenre;
	private Integer movieCollecion;
}
