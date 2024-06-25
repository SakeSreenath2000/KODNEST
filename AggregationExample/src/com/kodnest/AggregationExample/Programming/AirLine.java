package com.kodnest.AggregationExample.Programming;

public class AirLine {
	String airlineName;
	Pilot p;
	AirLine(String airlineName,Pilot p)
	{
		this.airlineName=airlineName;
		this.p=p;
	}
	void activity()
	{
		System.out.println(airlineName +" is doing activites");
		p.fly();
	}

}
