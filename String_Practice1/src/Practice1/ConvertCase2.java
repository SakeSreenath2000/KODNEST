package Practice1;

import java.util.Scanner;

public class ConvertCase2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.nextLine();
		System.out.println(str);
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			if(temp>=65 && temp<=90)
			{
				temp=temp+32;
			}
			else if(temp>=97 && temp<=122)
			{
				temp=temp-32;
			}
			//else
			//{
				//if any numbers are there we use else block even if we don not use code will execute
			//}
			arr[i]=(char)temp;
		}
		String str1=new String(arr);
		System.out.println(str1);
		
	}


}
