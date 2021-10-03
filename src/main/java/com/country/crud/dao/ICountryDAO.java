package com.country.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.country.crud.dto.Country;

public interface ICountryDAO extends JpaRepository<Country, Long>{
	
}
