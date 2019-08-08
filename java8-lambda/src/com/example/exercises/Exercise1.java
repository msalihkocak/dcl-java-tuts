package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

public class Exercise1 {

	public static void main(String[] args) {
		// Ex.1 Find the highest populated city of each country:
		CountryDao countryDao = InMemoryWorldDao.getInstance();
		
		List<City> highestPopulatedCitiesOfCountries = countryDao.findAllCountries().stream()
			.map( country ->{
				return country.getCities()
					.stream()
						.max(Comparator.comparing(City::getPopulation));
			}).filter(Optional::isPresent)
			.map(Optional::get).collect(Collectors.toList());
		
		highestPopulatedCitiesOfCountries.forEach(System.out::println);
	}

}
