package com.kodnest.SpringBoot.Programming.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.SpringBoot.Programming.Entities.Bike;

public interface BikeRepository extends JpaRepository<Bike,String>
{
	
}
