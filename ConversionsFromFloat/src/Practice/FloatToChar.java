package Practice;

public class FloatToChar {
	public static void main(String[] args) {
		float myFloat = 65.5f;
		//char myChar = myFloat;//Error
		char myChar = (char)myFloat;
		//Explicit Casting from float to char
		System.out.println("Original float: "+myFloat);
		System.out.println("Converted char: "+myChar);
		

	}

}
