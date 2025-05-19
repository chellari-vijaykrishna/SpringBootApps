package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vj.model.Movie;
import com.vj.service.IMovieService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runnner....!");

		List<Movie> mo = service.newMovies();
		mo.forEach(System.out::println);

		System.out.print("===================");

		List<Movie> moo = service.oldMovies();
		moo.forEach(System.out::println);

		System.out.print("===================");

		List<Movie> mooo = service.findByMovieGroupofMovies(53, 54);
		mooo.forEach(System.out::println);

		System.out.print("===================");

		List<Movie> moooo = service.findByMovieGroupofMoviesBetweenYears(2015, 2018);
		moooo.forEach(System.out::println);

		System.out.print("===================");

		List<Movie> movieNull = service.findByRatingNull();
		movieNull.forEach(System.out::println);

		System.out.print("===================");

		List<Object[]> movieNullM = service.findByRatingNullMovieNames();

		for (Object[] a : movieNullM) {
			for (Object b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

		System.out.print("===================");

		movieNullM.forEach(x -> {
			for (Object a : x) {
				System.out.print(a);
			}
			System.out.println();
		});

		System.out.print("===================");
		// List<Movie> movieDTOList = movieNullM.stream()
		// .map(row -> new Movie((Integer) row[0], (String) row[1]))
		// .collect(Collectors.toList());
		// movieDTOList.forEach(System.out::println);

		List<Object[]> movie = service.findByMovieById(60);

		movie.forEach(obj -> {
			for (Object a : obj) {
				System.out.println(a);
			}
			System.out.println();
		});

		System.out.print("===================");
		List<Object[]> movieNames = service.findByMovieByMovieName("Devara");

		movieNames.forEach(obj -> {
			for (Object a : obj) {
				System.out.println(a);
			}
			System.out.println();
		});

		System.out.print("===================");
		Object movieName = service.findByMovieByMovieNameByObj("Devara");
		System.out.println(movieName.toString());
		Object [] arg = (Object[])movieName;
		for(Object argg:arg) {
			System.out.print(argg+" ");
		}
		System.out.println();
		System.out.print("===================");
		System.out.println(service.findByMovieByMovieNameByString("Devara"));
		System.out.print("===================");
		
		
		Object movieNa = service.findByMovieByMovieNameByAggerate();
		Object [] arggg = (Object[])movieNa;
		for(Object argg:arggg) {
			System.out.print(argg+" ");
		}
		System.out.println();
		System.out.print("===================");
		
		
		service.findByMovieByMovieNameByHighRate()
		.forEach(System.out::print);
		System.out.print("===================");
		service.findByMovieByMovieNameByHighRate()
		.forEach(x->{
			System.out.println(x);
		});
		System.out.print("===================");
		
		Integer res = service.updateMovieRating(9.5d,54);
		System.out.println(res);
		
		if(res==0) {
			System.out.println("CommandLineRunner.run()");
			System.out.println("Not Updated");
		}
		else
		{
			System.out.println("CommandLineRunner.run() else");
			System.out.println("Updated"+"54");
		}
		System.out.print("===================");
		//System.out.println(service.updateMovieRating(9.5,54)==0?"Not Updated":"Updated"+"54");
		System.out.print("===================");
	}

}
