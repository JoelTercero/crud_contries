package com.country.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.crud.dao.ICountryDAO;
import com.country.crud.dto.Country;

@Service
public class CountryServiceImpl implements ICountryService{
	
	@Autowired
	ICountryDAO iCountryDAO;
	
	@Override
	public List<Country> listCountries() {
		return iCountryDAO.findAll();
	}

	@Override
	public Country saveCountry(Country country) {
		return iCountryDAO.save(country);
	}

	@Override
	public Country updateCountry(Country country) {
		return iCountryDAO.save(country);
	}

	@Override
	public void deleteCountry(Long id) {
		iCountryDAO.deleteById(id);
	}

	@Override
	public Country getCountryById(Long id) {
		return iCountryDAO.findById(id).get();
	}

}
