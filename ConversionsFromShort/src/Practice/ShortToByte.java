package Practice;

public class ShortToByte {

	public static void main(String[] args) {
		
		        short myShort = 200;
		        //byte myByte = myShort; //Error
		        byte myByte = (byte)myShort;
		        // Explicit casting from short to byte

		        System.out.println("Original short: " + myShort);
		        System.out.println("Converted byte: " + myByte);


	}

}
