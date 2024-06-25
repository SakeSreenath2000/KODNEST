package Practice;
public class Type1 {
	public static void main(String[] args) {
		add();//Method Call
		sub();//Method Call
		mul();//Method Call
		div();//Method Call
	}
	public static void add()
	{
		int a=70;
		int b=30;
		int c=a+b;
		System.out.println("Sum of a and b is "+c);
	}
	public static void sub()
	{
		int a=70;
		int b=30;
		int c=a-b;
		System.out.println("Sub of a and b "+c);
	}
	public static void mul()
	{
		int a=70;
		int b=30;
		int c=a*b;
		System.out.println("Mul of a and b "+c);
	}
	public static void div()
	{
		double a=70L;
		double b=30L;
		double c=a/b;
		System.out.println("Div of a and b "+c);
	}

}
