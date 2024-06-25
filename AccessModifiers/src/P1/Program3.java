package P1;

public class Program3 {
	void display3()
	{
		Program1 pr1=new Program1();
		System.out.println(pr1.a);/*Can be accessed outside the class also because it is public access modifier so it 
									can be accessed within the same class and also outside the class within the same 
									package and also can be accessed within the same project in different packages also*/
		System.out.println(pr1.b);/*Can be accessed outside the class also because it is protected access modifier so it 
									can be accessed within the same class and also outside the class within the same 
									package and also can be accessed in the child class of different packages also*/
		System.out.println(pr1.c);/*Can be accessed outside the class also because it is default access modifier so it 
									can be accessed within the same class and also outside the class within the same 
									package and it cannot be accessed if package is changed*/
		System.out.println(pr1.d);/*Cannot be accessed because it is a Private Access Modifier,private access modifiers 
									can only be accessed within the same class outside the class it is not accessible*/
	}

}
