package Practice;

public class LongToByte {

	public static void main(String[] args) {
		
		long myLong = 250L;
        //byte myByte = myLong; //Error
		byte myByte = (byte)myLong;
        // Explicit casting from long to byte

        System.out.println("Original long: " + myLong);
        System.out.println("Converted byte: " + myByte);


	}

}
