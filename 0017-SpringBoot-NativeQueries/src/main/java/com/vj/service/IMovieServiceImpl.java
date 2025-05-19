package com.vj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.repo.IMovieRepoJPA;

@Service
public class IMovieServiceImpl implements IMovieService {

	
	@Autowired
	private IMovieRepoJPA jpaRepo;

	
	@Override
	public Integer addMovieWithInsertQ(Integer movieId,String movieName, Double movieRating, Integer movieYear) {
		return jpaRepo.addMovieWithInsertQ(movieId,movieName, movieRating, movieYear);
	}


	@Override
	public Integer countAllRecords() {
		return jpaRepo.countAllRecords();
	}
	
	
	
}
