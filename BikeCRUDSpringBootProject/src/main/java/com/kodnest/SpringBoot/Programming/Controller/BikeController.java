package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kodnest.SpringBoot.Programming.Entities.Bike;
import com.kodnest.SpringBoot.Programming.Services.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {
	BikeService bkservice;

	public BikeController(BikeService bkservice) {
		super();
		this.bkservice = bkservice;
	}
	@PostMapping
	public String createBike(@RequestBody Bike b) {
		String msg=bkservice.createBike(b);
		return msg;
	}
	
	

}
