package Practice;
public class Adding_L_and_F_To_Long_and_Float_AtTheEnd {
	public static void main(String[] args) {
		//float a=3.147 //Error as 3.147 is treated as double
		//float a=(float)3.147 //No error but not good approach
		float a=3.147f;
		System.out.println(a);
		/* below declaration is error
		 * The literal 2147483649 of type "int" is out of range
		 */
		//long d=2147483649//Error
		long d=2147483649l;
		System.out.println(d);
		long e=2147483647;
		System.out.println(e);
		long f=222l;
		System.out.println(f);
		
		
	}

}
