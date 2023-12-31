package Practice;

public class IntToChar {
	public static void main(String[] args) {
		
		        int myInt = 65;
		        //char myChar = myInt; //Error
		        char myChar = (char)myInt;
		        // Explicit casting from int to char

		        System.out.println("Original int: " + myInt);
		        System.out.println("Converted char: " + myChar);


	}

}
