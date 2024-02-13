package Practice3;

import java.util.Scanner;

public class AllSubStrings {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        System.out.println("All substrings of the string are: ");
        for(int i=0;i<=str.length()-1;i++) 
        {
            for(int j=i+1;j<=str.length();j++) 
            {
            	/*if(str.substring(i,j).length()==3)
            	{
            		System.out.println(str.substring(i,j));
            		i.e this if condition used when we want to only particular length substrings(here Ex==3)
            	}*/
                System.out.println(str.substring(i,j));
                
            }
            
        }
        
    }

}
