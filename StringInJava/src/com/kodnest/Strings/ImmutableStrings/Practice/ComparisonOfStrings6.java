package com.kodnest.Strings.ImmutableStrings.Practice;

public class ComparisonOfStrings6 {
	public static void main(String[] args) {
		// Creating Immutable Strings by using inbuilt "String" class and without using "new" Operator
		String s1 = "Rama";
		String s2 = "Sita";
		String s3="Rama"+"Sita";
		String s4="Rama"+"Sita";
		// Comparing References of two Strings Using "=="(EqualsToOperator)
		if (s3 == s4) 
		{
			System.out.println("References Are Equal");
		} 
		else 
		{
			System.out.println("References Are Unequal");
		}
		// Comparing String Contents of two Strings Using "equals()" i.e equals method
		if (s3.equals(s4)) 
		{
			System.out.println("Strings Are Equal");
		} else 
		{
			System.out.println("Strings Are UnEqual");

		}
		String s5=s1+s2;
		String s6=s1+s2;
		// Comparing References of two Strings Using "=="(EqualsToOperator)
		if (s5 == s6) 
		{
			System.out.println("References Are Equal");
		} 
		else 
		{
			System.out.println("References Are Unequal");
		}
		// Comparing String Contents of two Strings Using "equals()" i.e equals method
		if (s5.equals(s6)) {
			System.out.println("Strings Are Equal");
		} 
		else
		{
			System.out.println("Strings Are UnEqual");
		}
	}

}
