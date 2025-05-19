package com.vj.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	private String movieName;
	private Integer movieYear;
	private Double movieRating;
	public Movie(String movieName, Integer movieYear, Double movieRating) {
		this.movieName = movieName;
		this.movieYear = movieYear;
		this.movieRating = movieRating;
	}
	
	public Movie(String movieName, Integer movieYear) {
		this.movieName = movieName;
		this.movieYear = movieYear;
	}
	
	
}
