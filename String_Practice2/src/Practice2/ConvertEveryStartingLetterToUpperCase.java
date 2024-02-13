package Practice2;

import java.util.Scanner;

public class ConvertEveryStartingLetterToUpperCase {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.nextLine();
		System.out.println(str);
		char arr[]=str.toCharArray();
		//if(arr.length>=0) 
		if(arr.length-1>=0)
		{
            arr[0]=Character.toUpperCase(arr[0]);
        }
		for(int i=0;i<=arr.length-1;i++)
		{
			//Logic To Check For Space
			if(arr[i]==' ')
			{
				int temp1=arr[i+1];
				if(temp1>=97 && temp1<=122)
				{
					temp1=temp1-32;
				}
				arr[i+1]=(char)temp1;
			}
			
		}
		String str1=new String(arr);
		System.out.println(str1);
	}


}
