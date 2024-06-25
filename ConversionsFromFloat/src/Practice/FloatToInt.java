package Practice;

public class FloatToInt {

	public static void main(String[] args) {
		
		float myFloat = 65.5f;
		//int myInt = myFloat;//Error
		int myInt= (int)myFloat;
		//Explicit Casting from float to int
		System.out.println("Original float: "+myFloat);
		System.out.println("Converted int: "+myInt);

	}

}
