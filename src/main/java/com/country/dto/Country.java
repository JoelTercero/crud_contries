package com.country.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "capital")
	private String capital;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "longitude")
	private double longitude;
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "languaje")
	private String languaje;
	
	@Column(name = "concurrency")
	private String concurrency;
	
	public Country() {
		
	}
	
	public Country(Long id, String name, String capital, double latitude, double longitude, int population,
			String languaje, String concurrency) {
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.latitude = latitude;
		this.longitude = longitude;
		this.population = population;
		this.languaje = languaje;
		this.concurrency = concurrency;
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getLanguaje() {
		return languaje;
	}
	public void setLanguaje(String languaje) {
		this.languaje = languaje;
	}
	public String getConcurrency() {
		return concurrency;
	}
	public void setConcurrency(String concurrency) {
		this.concurrency = concurrency;
	}
	
	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + ", capital=" + capital + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", population=" + population + ", languaje=" + languaje
				+ ", concurrency=" + concurrency + "]";
	}
}
