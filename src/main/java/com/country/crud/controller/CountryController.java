package com.country.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.country.crud.dto.Country;
import com.country.crud.service.CountryServiceImpl;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryServiceImpl countryServiceImpl;
	
	@GetMapping("/list")
	public List<Country> listCountries(){
		return countryServiceImpl.listCountries();
	}
	
	@PostMapping("/save")
	public Country saveCountry(@RequestBody Country country) {
		return countryServiceImpl.saveCountry(country);
	}
	
	@GetMapping("/{id}")
	public Country getCountryById(@PathVariable(name="id") Long id) {
		Country countryById = new Country();
		countryById = countryServiceImpl.getCountryById(id);
		return countryById;
	}
	
	@PutMapping("/update/{id}")
	public Country updateCountry(@PathVariable(name="id") Long id, @RequestBody Country country) {
		Country countryById = new Country();
		Country newCountry = new Country();
		
		countryById = countryServiceImpl.getCountryById(id);
		
		countryById.setCapital(country.getCapital());
		countryById.setConcurrency(country.getConcurrency());
		countryById.setLanguaje(country.getLanguaje());
		countryById.setLatitude(country.getLatitude());
		countryById.setLongitude(country.getLatitude());
		countryById.setName(country.getName());
		countryById.setPopulation(country.getPopulation());
		
		newCountry = countryServiceImpl.updateCountry(countryById);
		return newCountry;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCountry(@PathVariable(name="id") Long id) {
		countryServiceImpl.deleteCountry(id);
	}
	
}
