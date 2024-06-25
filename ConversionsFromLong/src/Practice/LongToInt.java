package Practice;

public class LongToInt {
	public static void main(String[] args) {
		 long myLong = 400L;
	     //int myInt =myLong;  //Error
		 int myInt = (int)myLong; 
	     //Implicit conversion from long to int

	      System.out.println("Original long: " +myLong);
	      System.out.println("Converted int: " +myInt);
		
	}

}
