package com.kodnest.Strings.ImmutableStrings.Practice;

public class ComparisonOfStrings5 {
	public static void main(String[] args) {
		String s1="SIREESHA";
		String s2="Sireesha";
		if(s1.equals(s2))
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are Unequal");
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are UnEqual");
		}
		/*String cricketer1="Sourav Gangoly"; i.e if we use this statement then the output is 
		 																"String 1 that is Sourav Gangoly is greater"*/
		String cricketer1="Sourav";
		/*String cricketer2="Sreenath"; i.e if we use this statement then the output is
		  																	"String 2 that is Sreenath is greater"*/
		String cricketer2="Sourav";
		if(cricketer1.compareTo(cricketer2)>0)
		{
			System.out.println("String 1 that is "+cricketer1+" is greater");
		}
		else if(cricketer1.compareTo(cricketer2)<0)
		{
			System.out.println("String 2 that is "+cricketer2+" is greater");
		}
		else
		{
			System.out.println("Strings Are equal");
		}
	}

}
