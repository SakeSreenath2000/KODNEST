package Practice2;

import java.util.Scanner;

public class ConvertingCharArrayUsingStringBuffer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.next();
		char arr[]=str.toCharArray();
		String res=createStringFromCharArray(arr);
		System.out.println("Created String:"+res);
		
	}
	public static String createStringFromCharArray(char arr[])
	{
		StringBuffer s1=new StringBuffer();
		for(int i=0;i<=arr.length-1;i++)
		{
			s1.append(arr[i]);
		}
		String res=s1.toString();
		return res;
	}

}
