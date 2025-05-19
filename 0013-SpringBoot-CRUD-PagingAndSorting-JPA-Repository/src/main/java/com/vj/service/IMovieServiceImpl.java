package com.vj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vj.model.Movie;
import com.vj.repo.IMovieRepoCurd;
import com.vj.repo.IMovieRepoJPA;
import com.vj.repo.IMovieRepoPagingAndSorting;

@Service
@SuppressWarnings("unused")
public class IMovieServiceImpl implements IMovieService {
	
	@Autowired
	private IMovieRepoCurd repo;
	
	@Autowired
	private IMovieRepoPagingAndSorting pageRepo;
	
	

	@Override
	public String registerMovie(Movie movie) {
		Movie mov = repo.save(movie);
		return mov.getMovieId()+" :"+" Saved";
	}

	@Override
	public String getMoviesCount() {
		Long count = repo.count();
		return count+" are there !";
	}

	@Override
	public Movie getMovieById(Integer id) {
		Optional<Movie> optional =repo.findById(id);
		Movie mov =null;
		if(optional.isPresent()) {
			mov = optional.get();
		}
		else {
			mov =null;
		}
		return mov;
	}

	@Override
	public String deleteMovie(Integer id) {
		Optional<Movie> optional =repo.findById(id);
		String res = null;
		if(optional.isPresent()) {
			repo.deleteById(id);
			res = "Deleted movie ::"+id;
		}
		else {
			res= "Movie not Found with ::"+id;
		}
		return res;
	}

	@Override
	public String updateMovie(Movie movie) {
		Optional<Movie> optional =repo.findById(movie.getMovieId());
		String res = null;
		if(optional.isPresent()) {
			repo.save(movie);
			res = "Updated movie ::"+movie.getMovieId();
		}
		else {
			res= "Movie not Found with ::"+movie.getMovieId();
		}
		return res;
	}

	@Override
	public List<Movie> listOutAllMovies() {
		  Iterable<Movie> movie = repo.findAll();
		  List<Movie> mo = new ArrayList<Movie>();  
		  for(Movie m:movie) {
			  mo.add(m);
		  }
		return mo;
	}

	@Override
	public List<Movie> listOutMoviesByIds(List<Integer> ints) {
		Iterable<Movie> movie = repo.findAllById(ints);
		List<Movie> mo = new ArrayList<Movie>();
		for(Movie m:movie) {
			  mo.add(m);
		  }
		return mo;
	}

	@Override
	public List<Integer> saveGroupOfMovies(List<Movie> mov) {
	 	Iterable<Movie> movie = repo.saveAll(mov);
	 	List<Integer> mo = new ArrayList<>();
		for(Movie m:movie) {
			  mo.add(m.getMovieId());
		  }
		return mo;
	}

	/*
	 * @Override public Page<Movie> getPageAndSorting(Integer pageSize,Integer
	 * noOfPages,Boolean sort,String ...args) { Pageable pageable =
	 * PageRequest.of(noOfPages,
	 * pageSize,Sort.by(sort?Direction.ASC:Direction.DESC,args)); Page<Movie> mov =
	 * pageRepo.findAll(pageable); return mov; }
	 */
	
	@Override
	public Page<Movie> getPageAndSorting(Integer noOfPage, Integer noOfRecordsInAPage, Boolean sort, String... args) {
		Pageable pageable1 = PageRequest.of(noOfPage, noOfRecordsInAPage);
		Sort sort2 = Sort.by(sort?Direction.ASC:Direction.DESC,args);
		
		Sort sort3 = Sort.by(Direction.ASC, args);
		return pageRepo.findAll(pageable1);
	}
	
	@Override
	public Iterable<Movie> getPageAndSortingIT(Boolean sort, String... args) {
		Sort sort1 = Sort.by(sort?Direction.ASC:Direction.DESC,args);
		Sort sort2 = Sort.by(args);
		return pageRepo.findAll(sort1);
	}
    
	
	@Override
	public Page<Movie> getPageAndSortingITFindAllExample(Integer noOfPage, Integer noOfRecordsInAPage,String movieName) {
		Movie probe = new Movie();
		probe.setMovieName(movieName);
		Example<Movie> exMovie = Example.of(probe);
		Pageable pageable1 = PageRequest.of(noOfPage, noOfRecordsInAPage);
		return pageRepo.findAll(exMovie,pageable1);
	}
	
	
}
