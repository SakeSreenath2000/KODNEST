package Practice;

public class DoubleToInt {
	public static void main(String[] args) {
		
		double myDouble = 250.64049494;
        //int myInt = myDouble; //Error
		int myInt = (int)myDouble;
        // Explicit casting from double to int

        System.out.println("Original double: " + myDouble);
        System.out.println("Converted int: " + myInt);

	}

}
