
public class Test {

	
	public static int fib(int n) {

		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		if (n < 0)
			System.out.println("Fibonacci number not recognized");
		else
			System.out.println(fib(n));
	}

}
