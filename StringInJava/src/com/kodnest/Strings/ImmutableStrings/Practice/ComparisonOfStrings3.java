package com.kodnest.Strings.ImmutableStrings.Practice;

public class ComparisonOfStrings3 {
	public static void main(String[] args) {
		String s1="Rama";
		//Assigning "s1" reference to "s2" i.e means assinging  address of "s1" to "s2"
		String s2=s1;//s1 reference address give it to s2
		if(s1==s2)
		{
			System.out.println("References Are Equal");
		}
		else
		{
			System.out.println("References Are Unequal");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are Unequal");
		}
	}

}
