package Practice;

public class DoubleToChar {
	public static void main(String[] args) {
		
		double myDouble = 65.50505;
		//char myChar = myDouble;//Error
		char myChar = (char)myDouble;
		//Explicit Casting from double to char
		System.out.println("Original double: "+myDouble);
		System.out.println("Converted char: "+myChar);
		

	}

}
