/*
 * User: Rodolfo Puig
 * Assignment 2: Fibonacci Sequence
 * Date: August 31, 2021
 */
/**
 * 
 * @author Rodolfo Puig
 *
 */
public class TestChanges {

	/**
	 * 
	 * @param n - will be used to generate fibonacci results using recursion
	 * @return - retrieve the recursive data
	 */

	public static int fib(int n) {

		// default must be greater than 1
		if (n <= 1)
			return n;
		else
			// fibonacci sequence
			return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// default number
		int n = 10;
		// n cannot be less than 0
		if (n < 0)
			System.out.println("Fibonacci number not recognized");
		else
			System.out.println(fib(n));
	}

}
