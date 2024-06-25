package com.kodnest.methodsProgramming;

public class TemperatureConverter {
	public double convertFahrenheitToCelsius(double fahrenheit) {
		 
		double Celsius = (fahrenheit - 32) * 5/9;
		return Celsius;
	}

}
