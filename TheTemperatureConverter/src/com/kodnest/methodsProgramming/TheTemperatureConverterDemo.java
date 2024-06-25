package com.kodnest.methodsProgramming;

import java.util.Scanner;

public class TheTemperatureConverterDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit ");
		double Fahrenheit =scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double result=temperatureConverter.convertFahrenheitToCelsius(68.0);
		System.out.println(result);

	}

}
