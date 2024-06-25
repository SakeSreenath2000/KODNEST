package Practice;

public class DoubleToFloat {

	public static void main(String[] args) {
		
		double myDouble = 250.64049494;
        //float myFloat = myDouble; //Error
		float myFloat = (float)myDouble;
        // Explicit casting from double to float

        System.out.println("Original double: " + myDouble);
        System.out.println("Converted float: " + myFloat);
        

	}

}
