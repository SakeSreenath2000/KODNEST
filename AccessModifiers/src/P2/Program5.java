package P2;
import P1.Program1;//Importing Program1 from P1 Package because Program1 is written in Package P1

public class Program5 {
	void display5()
	{
		Program1 p1=new Program1();
		System.out.println(p1.a);/*Can be accessed outside the class also because it is public access modifier so it 
								can be accessed within the same class and also outside the class within the same 
								package and also can be accessed within the same project in different packages also*/
		System.out.println(p1.b);/*Protected access modifiers cannot be accessed if it is not a child class 
																							in different packages*/
		System.out.println(p1.c);/*Default access modifier cannot be accessed if package is changed*/
		System.out.println(p1.d);/*Cannot be accessed because it is a Private Access Modifier,private access modifiers 
								can only be accessed within the same class outside the class it is not accessible*/
	}

}
