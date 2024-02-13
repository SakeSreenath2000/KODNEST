package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReplaceSpaceWith99Approach3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String res=replaceSpace(str);
		System.out.println(res);

}

	private static String replaceSpace(String str) {
		str=str.replace(" ","99");//i.e by using inbuilt replace()
		return str;
	}
}
