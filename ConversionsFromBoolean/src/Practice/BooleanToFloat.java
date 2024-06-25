package Practice;

public class BooleanToFloat {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//float myFloat = (float)myBoolean;//Error
		float myFloat = (float)myBoolean;
		//Cannot Cast from boolean to float
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted float: "+myFloat);

	}

}
