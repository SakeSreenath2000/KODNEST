package com.kodnest.AggregationExample.Programming;

public class AirlineApp {
	public static void main(String[] args) {
		Pilot P=new Pilot("Raju");
		P.fly();
		AirLine ar=new AirLine("KodAir",P);
		ar.activity();
		ar=null;
		ar.activity();/*This Statement gives an Error as "NULL POINTER EXPECTION"(means after saying ar=null the object 
						will destroyed so it shows null pointer mistake) because we have destroyed the AirLine object by
						saying 'ar=null'*/
		P.fly();/*After destroying the object class of AirLine class pilot is not accessible through the AirLine , But 
											it is accessible using its own reference*/
	}

}
