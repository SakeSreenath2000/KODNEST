package com.kodnest.SpringBoot.Programming.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.kodnest.SpringBoot.Programming.Entities.Bike;
import com.kodnest.SpringBoot.Programming.Repositories.BikeRepository;

@Service
public class BikeServiceImplementation implements BikeService{
	BikeRepository bkrepo;
	public BikeServiceImplementation(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}
	@Override
	public String createBike(Bike b) {
		bkrepo.save(b);
		return "Bike Object is Created and Saved";
	}
	@Override
	public List<Bike> fetchAllBikes() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateBike(Bike b) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
