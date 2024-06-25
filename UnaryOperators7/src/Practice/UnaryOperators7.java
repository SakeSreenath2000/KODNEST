package Practice;

public class UnaryOperators7 {
	public static void main(String[] args) {
		int a=10;
		int b;
		b=a++ + --a + a-- + a++;
		System.out.println(a);
		System.out.println(b);
	}
}
