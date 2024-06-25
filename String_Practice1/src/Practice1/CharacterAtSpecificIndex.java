package Practice1;

import java.util.Scanner;

public class CharacterAtSpecificIndex {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.next();
		System.out.println("Enter index value:");
		int index=scan.nextInt();
		char character=getCharacterAtIndex(str,index);
		System.out.println("Character at index "+index+" is : "+character);
		
	}
	public static char getCharacterAtIndex(String str,int index)
	{
		return str.charAt(index);
	}

}
