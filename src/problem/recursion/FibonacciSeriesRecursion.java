package problem.recursion;

public class FibonacciSeriesRecursion
{
	static int fib(int n)
	{
	    // Stop condition
	    if (n == 0)
	        return 0;
	 
	    // Stop condition
	    if (n == 1 || n == 2)
	        return 1;
	 
	    // Recursion function
	    else
	        return (fib(n - 1) + fib(n - 2));
	}
	public static void main(String[] args) {
		int n = 5;
	    System.out.printf("Fibonacci series of %d numbers is: ", n);
	 
	    // for loop to print the fiboancci series.
	    for (int i = 0; i < n; i++)
	    {
	    	System.out.printf("%d ", fib(i));
	    }
	}
}
