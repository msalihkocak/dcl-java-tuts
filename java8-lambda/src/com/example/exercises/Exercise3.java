package com.example.exercises;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.domain.Director;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

public class Exercise3 {

	public static void main(String[] args) {
		// Ex3. find the number movies of each director
		MovieService movieService = InMemoryMovieService.getInstance();
		
		Collection<Movie> movies = movieService.findAllMovies();
		
		Map<String, Long> directorMovieCounts = movies.stream()
			.map(Movie::getDirectors)
			.flatMap(List::stream)
			.collect(Collectors.groupingBy(Director::getName, Collectors.counting()));

		directorMovieCounts.entrySet().forEach(System.out::println);
		
	}

}
