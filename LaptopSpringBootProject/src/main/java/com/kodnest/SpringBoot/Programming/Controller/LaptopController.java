package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.SpringBoot.Programming.Entities.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	Laptop lap;
	
	@PostMapping
	public String createLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Laptop Object is Created";
	}
	@GetMapping("{serialNo}")
	public Laptop readLaptop(@PathVariable String serialNo) {
		return lap;
	}
	@PutMapping
	public String updateLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Laptop Object is Updated";
	}
	@DeleteMapping("{serialNo}")
	public String deleteLaptop(@PathVariable String serialNo) {
		lap=null;
		return "Laptop Object is Deleted";
	}

}
