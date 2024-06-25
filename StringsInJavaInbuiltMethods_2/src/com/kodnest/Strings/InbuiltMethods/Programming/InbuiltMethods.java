package com.kodnest.Strings.InbuiltMethods.Programming;

public class InbuiltMethods {
	public static void main(String[] args) {
        String str = "Hello, World!";
        String str2="      Hello World     ";
        
        System.out.println("=====================================================================================");
        System.out.println("Length of the string is : " + str.length());
        System.out.println("=====================================================================================");
        System.out.println("Character at index 7 is : " + str.charAt(7));
        System.out.println("=====================================================================================");
        System.out.println("Is the string empty? " + str.isEmpty());
        System.out.println("=====================================================================================");
        System.out.println("Concatenated string is : " + str.concat(" Goodbye!"));
        System.out.println("=====================================================================================");
        System.out.println("Is 'Hello, World!' equals 'Hello, World!'? " + str.equals("Hello, World!"));
        System.out.println("=====================================================================================");
        System.out.println("Is 'hello, world!' equals 'Hello, World!'? " + str.equalsIgnoreCase("hello, world!"));
        System.out.println("=====================================================================================");
        System.out.println("Compare 'Hello' with 'Hello, World!': " + str.compareTo("Hello"));
        System.out.println("=====================================================================================");
        System.out.println("Substring from index 2 is : " + str.substring(2));
        System.out.println("=====================================================================================");
        System.out.println("Substring from index 2 to 7 is : " + str.substring(2, 7));
        System.out.println("=====================================================================================");
        System.out.println("Index of 'o' is : " + str.indexOf('o'));
        System.out.println("=====================================================================================");
        System.out.println("Last index of 'o' is : " + str.lastIndexOf('o'));
        System.out.println("=====================================================================================");
        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello"));
        System.out.println("=====================================================================================");
        System.out.println("Ends with 'World!'? " + str.endsWith("World!"));
        System.out.println("=====================================================================================");
        System.out.println("Uppercase string is : " + str.toUpperCase());
        System.out.println("=====================================================================================");
        System.out.println("Lowercase string is : " + str.toLowerCase());
        System.out.println("=====================================================================================");
        System.out.println("Trimmed string is : " + str2.trim());
        System.out.println("=====================================================================================");
        System.out.println("Replaced 'l' with 'p' is : " + str.replace('l', 'p'));
        System.out.println("=====================================================================================");
        System.out.println("Splitting the string is : ");
        String[] splitString = str.split(" ");
        //For Each Loop
        for (String s : splitString) {
            System.out.println(s);
        }
        System.out.println("=====================================================================================");
        System.out.println("Value of integer 100 is : " + String.valueOf(100));
        System.out.println("=====================================================================================");
        System.out.println("Does the string contain 'World'? " + str.contains("World"));
        System.out.println("=====================================================================================");
        System.out.println("Formatted string is : " + String.format("The string is: %s", str));
        System.out.println("=====================================================================================");
        //ReplaceAll() 
        System.out.println("Replaced String is : " + str.replaceAll("Hello, World!","Sreenath"));
        System.out.println("=====================================================================================");
        //toCharArray()
        char arr[]=str.toCharArray();
        System.out.println("Character Array after converting String into Character Array by using toCharArray() is : ");
        //For Each Loop
        for(char x : arr)
        {
        	System.out.println(x);
        }
        System.out.println("=====================================================================================");
	}
}


	    