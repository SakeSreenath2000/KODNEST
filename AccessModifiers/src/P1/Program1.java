package P1;

public class Program1 {
	public int a;
	protected int b;
	int c;//No Access Modifier or Default Modifier
	private int d;
	void display1()
	{
		System.out.println(a);//Can be accessed
		System.out.println(b);//Can be accessed
		System.out.println(c);//Can be accessed
		System.out.println(d);/*Can be accessed only in the same class outside the class it is not accessed because 
				it is a Private Access Modifier , private access modifiers can only be accessed within the same class*/ 
	}

}
