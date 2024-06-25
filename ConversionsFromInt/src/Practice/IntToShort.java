package Practice;

public class IntToShort {
	public static void main(String[] args) {
		
		        int myInt = 1000;
		        //short myShort = myInt; //Error
		        short myShort = (short)myInt;
		        // Explicit casting from int to short

		        System.out.println("Original int: " + myInt);
		        System.out.println("Converted short: " + myShort);


	}

}
