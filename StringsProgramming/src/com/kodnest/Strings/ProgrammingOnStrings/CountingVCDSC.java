package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class CountingVCDSC { //VCDSC means V=Vowels,C=Consonants,D=Digits,SC=Special Characters
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		int vc=0;//vowel count
		int cc=0;//consonant count
		int dc=0;//digit count
		int sc=0;//special character count
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!Character.isDigit(str.charAt(i)))//i.e used to check character is not a digit
			{
				int a=str.charAt(i);
				if(!(a>=91 && a<=96))//i.e if this condition fails its a special character and if it is true then it is alphabet 
				{
					if(a>=65 && a<=122)//according to UTF 65 to 122 is alphabets i.e small and capital letters
					{
						if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
						{
							vc++;
						}
						else
						{	
							cc++;
						}
					}
					else
					{
						sc++;
					}
				}
				else
				{
					sc++;
				}
			}
			else
			{
				dc++;
			}
		}
		
			System.out.println("Vowels="+vc);
			System.out.println("Consonants="+cc);
			System.out.println("Digits="+dc);
			System.out.println("Special characters="+sc);
			
	}

}
