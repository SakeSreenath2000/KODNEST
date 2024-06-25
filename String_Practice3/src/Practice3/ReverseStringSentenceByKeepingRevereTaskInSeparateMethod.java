package Practice3;

import java.util.Scanner;

public class ReverseStringSentenceByKeepingRevereTaskInSeparateMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=scan.nextLine();
		System.out.println("Input String : "+s1);
		String res=isToReverse(s1);
		System.out.println("Reversed String : "+res);
		
	}
	public static String isToReverse(String s1)
	{
		char arr[]=s1.toCharArray();
		char arr1[]=new char[arr.length];
		int j=arr1.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr1[j]=arr[i];
			j--;
		}
		String str=new String(arr1);
		return str;
	}

}
