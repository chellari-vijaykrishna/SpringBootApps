package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.vj.model.Movie;
import com.vj.service.IMovieService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * System.out.println("Runnner....!"); Scanner sc = new Scanner(System.in);
		 * String movieName = sc.nextLine(); Integer movieYear = sc.nextInt(); Double
		 * movieRating = sc.nextDouble();
		 * 
		 * String res = service.registerMovie(new Movie(movieName, movieYear,
		 * movieRating));
		 * 
		 * System.out.println(res);
		 */

		/*
		 * String ress = service.getMoviesCount(); System.out.println(ress);
		 */

		/*
		 * String mov = service.deleteMovie(1); System.out.println(mov);
		 */

		/*
		 * Movie mov1 = new Movie(2,"Puspha",2024,6.0); String movv =
		 * service.updateMovie(mov1); System.out.println(movv);
		 */

		/*
		 * Movie movie = service.getMovieById(3); System.out.println(movie);
		 */

		/*
		 * List<Movie> mo = service.listOutAllMovies();
		 * System.out.println(mo.toString()); mo.forEach(x -> System.out.println(x));
		 * mo.forEach(System.out::println);
		 */
		
		/*
		 * List<Integer> mv = List.of(1,2,3,4,5); List<Movie> mo =
		 * service.listOutMoviesByIds(mv); System.out.println(mo.toString());
		 * mo.forEach(x -> System.out.println(x)); mo.forEach(System.out::println);
		 */
		
		/*
		 * List<Movie> mv = List.of(new Movie("Devara", 2025, 9.0), new
		 * Movie("Devara 2", 2026, 8.0), new Movie("Devara 3", 2027, 9.0), new
		 * Movie("Devara 4", 2028, 8.5), new Movie("Devara ", 2029, 8.9));
		 * 
		 * List<Integer> mo = service.saveGroupOfMovies(mv);
		 * System.out.println(mo.toString()); mo.forEach(x -> System.out.println(x));
		 * mo.forEach(System.out::println);
		 */
		
		
		 Page<Movie> mov = service.getPageAndSorting(0, 10, true, "movieName");
		 if(!mov.isEmpty()){ List<Movie> list = mov.getContent();
		 list.forEach(System.out::println); }else {
		 System.out.println("No Page Found"); }
		 
		
		
		// sc.close();
	}

}
