package com.country.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		System.out.println("Entro");
		return countryServiceImpl.listCountries();
	}
}
