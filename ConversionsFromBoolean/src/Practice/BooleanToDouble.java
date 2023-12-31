package Practice;

public class BooleanToDouble {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//double myDouble = (double)myBoolean;//Error
	    double myDouble = (double)myBoolean;
		//Cannot Cast from boolean to double
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted double: "+myDouble);

	}

}
