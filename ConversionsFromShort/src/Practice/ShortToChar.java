package Practice;

public class ShortToChar {

	public static void main(String[] args) {
		
		        short myShort = 65;
		        //char myChar = myShort; //Error
		        char myChar = (char)myShort; 
		        // Explicit casting from short to char

		        System.out.println("Original short: " + myShort);
		        System.out.println("Converted char: " + myChar);


	}

}
