package Practice;
public class Type2 {
	public static void main(String[] args) {
		int result1=add();//Method Call
		int result2=sub();//Method Call
		int result3=mul();//Method Call
		double result4=div();//Method Call
	}
	public static int add(){
		int a=70;
		int b=30;
		int c=a+b;
		System.out.println("Sum of a and b is "+c);
		return c;
	}
	public static int sub(){
		int a=70;
		int b=30;
		int c=a-b;
		System.out.println("Sub of a and b "+c);
		return c;
	}
	public static int mul(){
		int a=70;
		int b=30;
		int c=a*b;
		System.out.println("Mul of a and b "+c);
		return c;
	}
	public static double div(){
		double a=70L;
		double b=30L;
		double c=a/b;
		System.out.println("Div of a and b "+c);
		return c;
	}
}
