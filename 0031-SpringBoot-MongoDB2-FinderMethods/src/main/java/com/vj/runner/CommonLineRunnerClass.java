package com.vj.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.vj.model.Movie;
import com.vj.repo.IMovieRepo;

@Component
public class CommonLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started...!!!");

		
		
//		Integer idVal1 = new Random().nextInt(1000000);
//		Movie movie = new Movie();
//		
//		movie.setMovieId(idVal1);
//		movie.setMovieName("RRR");
//		movie.setMovieGenre("ACTION");
//		movie.setMovieCollecion(500);
//		
//		Movie movie1 = new Movie();
//		Integer idVal2 = new Random().nextInt(1000000);
//		movie1.setMovieId(idVal2);
//		movie1.setMovieName("Devara");
//		movie1.setMovieGenre("ACTION");
//		movie1.setMovieCollecion(700);
//		
//		Movie movie2 = new Movie();
//		Integer idVal3 = new Random().nextInt(1000000);
//		movie2.setMovieId(idVal3);
//		movie2.setMovieName("Dhee");
//		movie2.setMovieGenre("ACTION");
//		movie2.setMovieCollecion(100);
//
//		repo.saveAll(List.of(movie, movie1, movie2));
		
		
		//repo.deleteByMovieId(243882);
//		repo.deleteById("682c7d1b360d0b51ce41f7e5");
//		repo.deleteById("682c7d1b360d0b51ce41f7e6");
//		repo.deleteById("682c7d68c2a3511e726386da");
//		repo.deleteById("682c7d68c2a3511e726386db");
//		repo.deleteById("682c7d68c2a3511e726386dc");
		
		//Optional<Movie> optional = repo.findById("682c7d1b360d0b51ce41f7e4");
		
		
		//System.out.println(optional.get());
		
		
		List<Movie> movies =repo.findByMovieGenre("ACTION");
		movies.forEach(System.out::println);
		
		
		String[]arg = {"movieName"};
		
		Sort sort = Sort.by(Direction.ASC, arg);
		
		List<Movie> moviess =repo.findAll(sort);
		
		moviess.forEach(System.out::println);
		
		System.out.println();
	}

}
