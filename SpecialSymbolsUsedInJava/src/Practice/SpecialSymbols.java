package Practice;

public class SpecialSymbols {
	public static void main(String[] args) {
		int help=10;
		int help_=20;
		int _help=30;
		int $help=40;
		int help$=50;
		int hel$p=60;
		int h_e$lp=70;
		int h_e_l_p=80;
		int h$e$l$p=90;
		System.out.println(help);
		System.out.println(help_);
		System.out.println(_help);
		System.out.println($help);
		System.out.println(help$);
		System.out.println(hel$p);
		System.out.println(h_e$lp);
		System.out.println(h_e_l_p);
		System.out.println(h$e$l$p);
		//int 2help;Error because a variable name cannot start with a number
		int temp=1_0;
		System.out.println(temp);
		int $temp=1__0;
		System.out.println($temp);
		int _temp=1_________________________________________________________0;
		System.out.println(_temp);
		float temp2=3.1_47f;
		System.out.println(temp2);
		//int tem_p=_10; Error
		
		//int te_mp=10_; Error
		
		//float temp3=33_.147f; Error
	}

}
