package com.kodnest.Strings.ImmutableStrings.Practice;

public class ComparisonOfStrings4 {
	public static void main(String[] args) {
		String s1="Rama";
		System.out.println(s1);
		/*Now we will use concatenate statement to add "Sita" to "Rama" , but here "Rama" is Immutable String it does 
		not change but a copy or clone of concatenated String will be created in the String Pool (RamaSita) separately*/
		s1.concat("Sita");
		System.out.println(s1);
		//s1=s1.concat("Sita");
		/*Immutable String objects once created cannot be changed but the reference variable holding the address of that
		 particular string can be change (s1=s1.concat("Sita");) Then concatenated string object that is created 
		 separately (RamaSita) address will be given to "s1" reference variable and starts referring to "RamaSita"*/
		//System.out.println(s1); i.e then "RamaSita" will be printed.
	}

}
