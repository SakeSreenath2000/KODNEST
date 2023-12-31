package Practice;
public class Type3 {
	public static void main(String[] args) {
		int a=70;
		int b=30;
		double x=70L;
		double y=30L;
		add(a,b);//Method Call
		sub(a,b);//Method Call
		mul(a,b);//Method Call
		div(x,y);//Method Call
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of a and b is "+c);
	}
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Sub of a and b "+c);
	}
	public static void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Mul of a and b "+c);
	}
	public static void div(double x,double y)
	{
		double c=x/y;
		System.out.println("Div of x and y "+c);
	}
}
