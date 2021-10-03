package com.country.crud.service;

import java.util.List;
import com.country.crud.dto.Country;

public interface ICountryService {
	
	public List<Country> listCountries();
	
	public Country saveCountry(Country country);
	
	public Country updateCountry(Country country);
	
	public void deleteCountry(Long id);
	
	public Country getCountryById(Long id);
}
