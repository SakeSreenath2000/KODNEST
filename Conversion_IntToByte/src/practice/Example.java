package practice;

public class Example {
	public static void main(String[] args) {
		byte x=100;//Implicit Narrowing Conversion from "int" to "byte"
		System.out.println("X = "+x);/*If we try to assign the value outside the valid range of byte or short , we will
		 							   encounter a error unless you explicitly perform a cast to inform the compiler that
		 							   you are aware of the source data will be lost*/
		//byte ranges from -128 to +127
	}

}
