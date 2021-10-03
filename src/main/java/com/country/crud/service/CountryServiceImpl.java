package com.country.crud.service;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country updateCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCountry(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Country getCountryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
