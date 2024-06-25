package Practice;

public class FloatToByte {
public static void main(String[] args) {
	
		float myFloat = 65.5f;
		//byte myByte = myFloat;//Error
		byte myByte = (byte)myFloat;
		//Explicit Casting from float to byte
		System.out.println("Original float: "+myFloat);
		System.out.println("Converted byte: "+myByte);
		

	}

}
