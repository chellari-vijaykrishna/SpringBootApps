package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.vj.model.Movie;

@Transactional
public interface IMovieRepoJPA extends JpaRepository<Movie, Integer> {
	
	@Modifying
	@Query(
	    value = "INSERT INTO MOVIE (MOVIE_ID, MOVIE_NAME, MOVIE_RATING, MOVIE_YEAR) VALUES (?1, ?2, ?3, ?4)",
	    nativeQuery = true
	)
	public Integer addMovieWithInsertQ(Integer movieId, String movieName, Double movieRating, Integer movieYear);
	
	//@Modifying
	@Query(
			value = "SELECT COUNT(*) FROM MOVIE",
			nativeQuery = true
	)
	public Integer countAllRecords();

}
