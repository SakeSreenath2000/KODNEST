package Practice;

public class DoubleToShort {
	public static void main(String[] args) {
		
		double myDouble = 25.64049494;
        //short myShort = myDouble; //Error
		short myShort = (short)myDouble;
        // Explicit casting from double to short

        System.out.println("Original double: " + myDouble);
        System.out.println("Converted short: " + myShort);

	}

}
