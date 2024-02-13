package com.kodnest.Strings.ImmutableStrings.Practice;

public class InternMethod {
	public static void main(String[] args) {
		String str=new String("Kodnest");
		System.out.println(str);
		//Intern Method is used to bring a copy of String that is present outside the String Pool into the String Pool
		String str2=str.intern();
		System.out.println(str2);
		//Creating a Duplicate String Which a copy is already brought to String Pool by Intern Method 
		String str3="Kodnest";
		if(str2==str3)
		{
			System.out.println("References Are Equal");
		}
		else
		{
			System.out.println("References Are Unequal");
		}
	
	}


}
