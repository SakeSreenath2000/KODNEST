package Practice;

public class ByteToChar {
	public static void main(String[] args) {
		
		        byte myByte = 65;
		        //char myChar = myByte; //Error
		        char myChar = (char)myByte;
		        // Explicit casting from byte to char

		        System.out.println("Original byte: " + myByte);
		        System.out.println("Converted char: " + myChar);


	}

}
