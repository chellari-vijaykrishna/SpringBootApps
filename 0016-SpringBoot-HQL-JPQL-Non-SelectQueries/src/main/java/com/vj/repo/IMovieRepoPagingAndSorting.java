package com.vj.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.vj.model.Movie;

public interface IMovieRepoPagingAndSorting extends PagingAndSortingRepository<Movie, Integer>,QueryByExampleExecutor<Movie> {

}
