package com.country.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.country.dto.Country;

public interface ICountryDAO extends JpaRepository<Country, Long>{
	
}
