package Practice;

public class LongToChar {

	public static void main(String[] args) {
		
		long myLong = 83L;
        //char myChar = myLong;//Error
		char myChar = (char)myLong;
        // Explicit casting from long to char

        System.out.println("Original long: " + myLong);
        System.out.println("Converted char: " + myChar);


	}

}
