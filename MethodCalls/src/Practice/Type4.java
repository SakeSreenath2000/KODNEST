package Practice;
public class Type4 {
	public static void main(String[] args) {
		int a=70;
		int b=30;
		double x=70L;
		double y=30L;
		int result1=add(a,b);//Method Call
		int result2=sub(a,b);//Method Call
		int result3=mul(a,b);//Method Call
		double result4=div(x,y);//Method Call
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of a and b is "+c);
		return c;
	}
	public static int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Sub of a and b "+c);
		return c;
	}
	public static int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Mul of a and b "+c);
		return c;
	}
	public static double div(double x,double y)
	{
		double c=x/y;
		System.out.println("Div of x and y "+c);
		return c;
	}
}
