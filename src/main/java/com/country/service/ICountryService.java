package com.country.service;

import java.util.List;
import com.country.dto.Country;

public interface ICountryService {
	
	public List<Country> listCountry();
	
	public Country saveCountry(Country country);
	
	public Country updateCountry(Country country);
	
	public void deleteCountry(Long id);
	
	public Country getCountryById(Long id);
}
