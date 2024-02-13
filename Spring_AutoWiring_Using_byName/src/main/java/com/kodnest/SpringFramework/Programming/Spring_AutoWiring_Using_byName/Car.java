package com.kodnest.SpringFramework.Programming.Spring_AutoWiring_Using_byName;

public class Car {
	/*To Achieve AutoWiring using byName we must have the same name for one of the bean in the Config.xml file
	 									and reference variable name of class where value has to be injected */
	Engine eng;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine eng) {
		super();
		this.eng = eng;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [eng=" + eng + "]";
	}
	
}
