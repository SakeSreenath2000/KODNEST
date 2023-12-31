package Practice;

public class FloatToShort {
	public static void main(String[] args) {
		
		float myFloat = 65.5f;
		//short myShort = myFloat;//Error
		short myShort= (byte)myFloat;
		//Explicit Casting from float to short
		System.out.println("Original float: "+myFloat);
		System.out.println("Converted short: "+myShort);
	}

}
