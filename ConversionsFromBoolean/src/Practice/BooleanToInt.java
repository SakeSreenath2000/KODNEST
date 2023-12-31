package Practice;

public class BooleanToInt {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//int myInt = (int)myBoolean;//Error
		int myInt = (int)myBoolean;
		//Cannot Cast from boolean to int
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted int: "+myInt);

	}

}
