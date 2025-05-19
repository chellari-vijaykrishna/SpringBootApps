package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.model.Movie;
import com.vj.view.ResultView;
import com.vj.view.View;

public interface IMovieRepoJPA extends JpaRepository<Movie, Integer> {
	
	public List<Movie> findByMovieName(String movieName);
	public List<Movie> findByMovieRating(Double movieRating);
	public List<Movie> findByMovieYear(Integer movieYear);
	public List<Movie> findByMovieId(Integer movieId);
	public List<Movie> findByMovieNameStartingWith(String name);
	public List<Movie> findByMovieNameContaining(String name);
	
	List<ResultView> findByMovieNameContainingAndMovieYearGreaterThan(String name,Integer no);
	
	public <T extends View> List<T> findByMovieNameContainingAndMovieYearGreaterThan(String name,Integer no,Class<T> clazz);
	
	public <T> List<T> findByMovieYearGreaterThan(Integer no,Class<T> clazz);
	
}
