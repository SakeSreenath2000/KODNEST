package Practice1;

import java.util.Scanner;

public class ConvertCaseByKeeingTaskInAotherMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.nextLine();
		System.out.println(str);
		String res=convertCase(str);
		System.out.println(res);
		
	}
	public static String convertCase(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int temp1;
			if(temp>=65 && temp<=90)
			{
				temp1=temp+32;
			}
			else
			{
				temp1=temp-32;
			}
			arr[i]=(char)temp1;
		}
		String str1=new String(arr);
		//System.out.println(str1);
		return str1;
	}


}
