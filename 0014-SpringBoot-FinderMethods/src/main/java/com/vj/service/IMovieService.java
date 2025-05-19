package com.vj.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.vj.model.Movie;
import com.vj.view.ResultView;
import com.vj.view.View;

public interface IMovieService {
	
     public String registerMovie(Movie movie); 
     public String getMoviesCount();
     public Movie getMovieById(Integer id);
     public String deleteMovie(Integer id);
     public String updateMovie(Movie mov);    
     public List<Movie> listOutAllMovies();
     public List<Movie> listOutMoviesByIds(List<Integer> ints);
     public List<Integer> saveGroupOfMovies(List<Movie> mov);
     
     public Page<Movie> getPageAndSorting(Integer pageSize,Integer noOfPages,Boolean sort,String ...a);
     
     public Iterable<Movie> getPageAndSortingIT(Boolean sort,String ...a);
     
     public Page<Movie> getPageAndSortingITFindAllExample(Integer noOfPage, Integer noOfRecordsInAPage,String movieName);

     
     public List<Movie> getMoviesByStartBy(String name);
     
     public List<Movie> getMoviesByContainingd(String name);
     
     public List<ResultView> findByMovieNameContainingApplyingConditions2ValusesStatic(String name,Integer no);

     
     public <T extends View> List<T> findByMovieNameContainingMovieNameAndYearDynamicProjections(String name,Integer no,Class<T> clazz);
     
     public <T> List<T> findByMovieNameContainingMovieNameAndYearDynamicProjectionsWithSingleClass(Integer no,Class<T> clazz);

     
     
}
