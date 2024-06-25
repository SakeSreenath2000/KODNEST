package Practice;

public class BooleanToChar {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//char myChar = (char)myBoolean;//Error
		char myChar = (char)myBoolean;
		//Cannot Cast from boolean to char
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted char: "+myChar);

	}

}
