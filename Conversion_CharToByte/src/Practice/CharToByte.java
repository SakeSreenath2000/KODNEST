package Practice;
public class CharToByte {
	public static void main(String[] args) {
		
		        char myChar = 'A';
		        //byte myByte = myChar; //Error
		        byte myByte = (byte)myChar;
		        // Explicit casting from char to byte

		        System.out.println("Original char: " +myChar);
		        System.out.println("Converted byte: " +myByte);
	}
}
