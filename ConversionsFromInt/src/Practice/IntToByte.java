package Practice;

public class IntToByte {
	public static void main(String[] args) {
		
		        int myInt = 1000;
		        //byte myByte = myInt; //Error
		        byte myByte = (byte)myInt; 
		        // Explicit casting from int to byte

		        System.out.println("Original int: " + myInt);
		        System.out.println("Converted byte: " + myByte);


	}

}
