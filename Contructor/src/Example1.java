
public class Example1 {
//int a;
	Example1() {
		System.out.println("this is my first zero-parameteized constructor");
	}

	Example1(int a) {
		// this(0.2);
		System.out.println("this is my second type of integer constructor = " + a);
	}

	Example1(double b) {
		// this(2);
		System.out.println("this is my double type of parameter =" + b);
	}

	Example1(char c, double g, int f)
	{
		this(20.2);
	}

	public static void main(String[] args) {
		System.out.println("hello");

		new Example1();
		new Example1(2);
		new Example1(0.2);
		new Example1('S', 20.2, 5);

	}

}
