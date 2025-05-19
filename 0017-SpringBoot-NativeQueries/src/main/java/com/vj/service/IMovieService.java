package com.vj.service;


public interface IMovieService {

	public Integer addMovieWithInsertQ(Integer movieId,String movieName,Double movieRating,Integer movieYear);
	
	public Integer countAllRecords();
	
}
