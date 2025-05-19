package com.vj.repo;

import org.springframework.data.repository.CrudRepository;

import com.vj.model.Movie;

public interface IMovieRepoCurd extends CrudRepository<Movie, Integer> {

}
