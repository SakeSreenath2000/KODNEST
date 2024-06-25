package Practice;

public class FloatToLong {

	public static void main(String[] args) {
		
		float myFloat = 65.5f;
		//long myLong = myFloat;//Error
		long myLong= (long)myFloat;
		//Explicit Casting from float to long
		System.out.println("Original float: "+myFloat);
		System.out.println("Converted long: "+myLong);

	}

}
