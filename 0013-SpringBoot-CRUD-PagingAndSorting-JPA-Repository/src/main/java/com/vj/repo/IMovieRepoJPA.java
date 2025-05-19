package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.model.Movie;

public interface IMovieRepoJPA extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByMovieName(String movieName);
	List<Movie> findByMovieRating(Double movieRating);
	List<Movie> findByMovieYear(Integer movieYear);
	List<Movie> findByMovieId(Integer movieId);
	
	List<Movie> findByMovieNameStartingWith(String name);
	

}
