package Practice;

public class LongToShort {
	public static void main(String[] args) {
		
		long myLong = 500L;
       // short myShort = myLong; //Error
		short myShort = (short)myLong;
        // Explicit casting from long to short

        System.out.println("Original long: " + myLong);
        System.out.println("Converted short: " + myShort);
	}

}
