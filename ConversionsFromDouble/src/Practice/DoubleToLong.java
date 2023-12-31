package Practice;

public class DoubleToLong {
	public static void main(String[] args) {
		
		double myDouble = 250.64049494;
        //long myLong = myDouble; //Error
		long myLong = (long)myDouble;
        // Explicit casting from double to long

        System.out.println("Original double: " + myDouble);
        System.out.println("Converted long: " + myLong);

	}

}
