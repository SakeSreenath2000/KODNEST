package com.kodnest.Strings.ImmutableStrings.Practice;

public class ComparisonOfStrings1 {
	public static void main(String[] args) {
		//Creating Immutable Strings by using inbuilt "String" class and without using "new" Operator
		String s1="Rama";
		String s2="Rama";
		//Comparing References of two Strings Using "=="(EqualsToOperator)
		if(s1==s2)
		{
			System.out.println("References Are Equal");
		}
		else
		{
			System.out.println("References Are Unequal");
		}
		//Creating Immutable Strings by using inbuilt "String" class and with using "new" Operator
		String s3=new String("Sita");
		String s4=new String("Sita");
		//Comparing References of two Strings Using "=="(EqualsToOperator)
		if(s3==s4)
		{
			System.out.println("References Are Equal");
		}
		else
		{
			System.out.println("References Are Unequal");
		}
		//Comparing String Contents of two Strings Using "equals()" i.e equals method
		if(s1.equals(s2))
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are UnEqual");

		}
		//Comparing String Contents of two Strings Using "equals()" i.e equals method
		if(s3.equals(s4))
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are UnEqual");

		}
	}

}
