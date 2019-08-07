package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

public class Exercise2 {

	public static void main(String[] args) {
		
		// Find the most populated city of each continent
		CountryDao countryDao = InMemoryWorldDao.getInstance();
		countryDao.getAllContinents().forEach(continent -> countryDao.findCountriesByContinent(continent));
		// To be continued
		
	}

}
