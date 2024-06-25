package Practice;

public class BooleanToShort {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		//short myShort = (short)myBoolean;//Error
		short myShort = (short)myBoolean;
		//Cannot Cast from boolean to short
		System.out.println("Original boolean: "+myBoolean);
		System.out.println("Converted short: "+myShort);

	}

}
