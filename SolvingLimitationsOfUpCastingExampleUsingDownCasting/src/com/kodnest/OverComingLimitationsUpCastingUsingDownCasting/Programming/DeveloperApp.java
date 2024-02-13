package com.kodnest.OverComingLimitationsUpCastingUsingDownCasting.Programming;

public class DeveloperApp {
	public static void main(String[] args) {
		Developer dev;
		BackEndDeveloper bed= new BackEndDeveloper();
		//UpCasting - Assigning BackEndDeveloper Object to Developer "dev" reference
		dev=bed;
		dev.AttendMeeting();
		dev.project();
		//Performing DownCasting - Converting dev(Parent type reference) to BackEndDeveloper (Child Object)
		((BackEndDeveloper)(dev)).learnJava();//Calling Child - Specific Method
		DataBaseDeveloper dbd=new DataBaseDeveloper();
		//UpCasting - Assigning DataBaseDeveloper Object to Developer "dev" reference
		dev=dbd;
		dev.AttendMeeting();
		dev.project();
		//Performing DownCasting - Converting dev(Parent type reference) to DataBaseDeveloper (Child Object)
		((DataBaseDeveloper)(dev)).learnSQL();//Calling Child - Specific Method
		WebDeveloper wd=new WebDeveloper();
		//UpCasting - Assigning WebDeveloper Object to Developer "dev" reference
		dev=wd;
		dev.AttendMeeting();
		dev.project();
		//Performing DownCasting - Converting dev(Parent type reference) to WebDeveloper (Child Object)
		((WebDeveloper)(dev)).learnHTML();//Calling Child - Specific Method
		
	}


}
