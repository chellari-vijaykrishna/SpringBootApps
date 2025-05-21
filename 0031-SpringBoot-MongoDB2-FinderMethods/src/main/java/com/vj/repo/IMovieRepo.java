package com.vj.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Movie;
import java.util.List;


public interface IMovieRepo extends MongoRepository<Movie, Integer> {
	
	
       public String deleteByMovieId(Integer id);
       
       public List<Movie> findByMovieGenre(String movieGenre);
}
