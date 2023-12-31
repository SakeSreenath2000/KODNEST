package Practice;

public class CharToShort {
	public static void main(String[] args) {

		        char myChar = 'B';
		        //short myShort = myChar; //Error
		        short myShort = (short)myChar;
		        // Explicit casting from char to short

		        System.out.println("Original char: " +myChar);
		        System.out.println("Converted short: " +myShort);

	}
}
