package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.vj.model.Movie;
import com.vj.view.ResultView;
import com.vj.view.View;


@Transactional
public interface IMovieRepoJPA extends JpaRepository<Movie, Integer> {

	public List<Movie> findByMovieName(String movieName);

	public List<Movie> findByMovieRating(Double movieRating);

	public List<Movie> findByMovieYear(Integer movieYear);

	public List<Movie> findByMovieId(Integer movieId);

	public List<Movie> findByMovieNameStartingWith(String name);

	public List<Movie> findByMovieNameContaining(String name);

	List<ResultView> findByMovieNameContainingAndMovieYearGreaterThan(String name, Integer no);

	public <T extends View> List<T> findByMovieNameContainingAndMovieYearGreaterThan(String name, Integer no,
			Class<T> clazz);

	public <T> List<T> findByMovieYearGreaterThan(Integer no, Class<T> clazz);
	
	
	//find the latest movie that is max of year movie
	
	//HQL Queries
	
	@Query("FROM Movie m WHERE m.movieYear in (SELECT MAX(m2.movieYear) FROM Movie m2)")
	public List<Movie> findLatestMovieMaxYear();
	
	@Query("FROM Movie m WHERE m.movieYear in (SELECT MIN(m2.movieYear) FROM Movie m2)")
	public List<Movie> findOldMovieMaxYear();
	
	//named parameters
    //@Query("From Movie m Where m.movieId in(:id1,:id2)")
    //public List<Movie> findByMovieGroupofMovies(Integer id1,Integer id2);
	
	//HQL parameters
	@Query("From Movie m Where m.movieId in(?1,?2)")
	public List<Movie> findByMovieGroupofMovies(Integer id1,Integer id2);
	
	//@Query("From Movie m Where m.movieYear>=?1 and m.movieYear<=?2")
	//public List<Movie> findByMovieGroupofMoviesBetweenYears(Integer id1,Integer id2);
	
	@Query("From Movie m Where m.movieYear>=:id1 and m.movieYear<=:id2")
	public List<Movie> findByMovieGroupofMoviesBetweenYears(Integer id1,Integer id2);
	
	@Query("From Movie m Where m.movieRating is null")
	public List<Movie> findByRatingNull();
	
	
	@Query("Select movieId,movieName From Movie Where movieRating is null")
	public List<Object[]> findByRatingNullMovieNames();

	@Query("Select movieId,movieName From Movie Where movieId=?1")
	public List<Object[]> findByMovieById(Integer id1);
	
	@Query("Select movieId,movieName From Movie Where movieName=?1")
	public List<Object[]> findByMovieByMovieName(String movieName);
	
	@Query("Select movieId,movieName From Movie Where movieName=?1")
	public Object findByMovieByMovieNameByObj(String movieName);

	@Query("Select movieName From Movie Where movieName=?1")
	public Object findByMovieByMovieNameByString(String movieName);
	
	@Query("Select count(*),max(movieRating),min(movieRating),avg(movieRating),sum(movieYear) From Movie")
	public Object findByMovieByMovieNameByAggerate();
	
	@Query("From Movie m where m.movieRating=(select max(movieRating) From Movie)")
	public List<Movie> findByMovieByMovieNameByHighRate();
	
	@Modifying
	@Query("Update Movie m SET m.movieRating =:newRating where m.movieId =:movieId")
	public Integer updateMovieRating(Double newRating,Integer movieId);
	
	@Modifying
	@Query("Update Movie m SET m.movieRating =?1 where m.movieId =?2")
	public Integer updateMovieRatingPostionalParams(Double newRating,Integer movieId);
	
	@Modifying
	@Query("Update Movie m SET m.movieRating =?1 where m.movieId =?2")
	public Integer updateMovieRatingParmsAnn(@Param("newRating")Double newRating,@Param("movieId")Integer movieId);
	
}
