package com.kodnest.SpringBoot.Programming.Services;

import java.util.List;

import com.kodnest.SpringBoot.Programming.Entities.Bike;

public interface BikeService {
	public String createBike(Bike b);
	public List<Bike> fetchAllBikes();
	public String updateBike(Bike b);
	public String deleteBike(String engNo);
	
}
