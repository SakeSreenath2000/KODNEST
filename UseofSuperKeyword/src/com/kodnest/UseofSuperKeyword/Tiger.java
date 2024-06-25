package com.kodnest.UseofSuperKeyword;

public class Tiger extends Animal {
	String tigersound="Tiger Sound";
	public void makesound()
	{
		System.out.println("Tiger is making "+tigersound);
	}
	public void accessParentMehtod()
	{
		super.makesound();
	}

}
