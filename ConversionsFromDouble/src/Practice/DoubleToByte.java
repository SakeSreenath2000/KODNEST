package Practice;

public class DoubleToByte {
	public static void main(String[] args) {
		double myDouble = 250.64049494;
        //byte myByte = myDouble; //Error
		byte myByte = (byte)myDouble;
        // Explicit casting from double to byte

        System.out.println("Original double: " + myDouble);
        System.out.println("Converted byte: " + myByte);

	}

}
