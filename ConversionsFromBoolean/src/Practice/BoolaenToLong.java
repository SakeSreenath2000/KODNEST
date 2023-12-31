package Practice;

public class BoolaenToLong {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//long myLong = (long)myBoolean;//Error
		long myLong = (long)myBoolean;
		//Cannot Cast from boolean to long
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted long: "+myLong);

	}

}
