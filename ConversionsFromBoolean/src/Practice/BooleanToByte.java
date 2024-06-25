package Practice;

public class BooleanToByte {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//byte myByte = (byte)myBoolean;//Error
		byte myByte = (byte)myBoolean;
		//Cannot Cast from boolean to byte
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted byte: "+myByte);


	}

}
