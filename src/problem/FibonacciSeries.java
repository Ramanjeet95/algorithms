package problem;

public class FibonacciSeries
{
	static void generateFibonacciSeries(int n)
	{
		int prev = 0;
		int curr = 1;
		int next = 0;
		System.out.println(0);
		System.out.println(1);
		while(next < n-2)
		{
			next = prev+curr;
			prev = curr;
			System.out.println(curr);
			curr = next;
		}
	}
	public static void main(String[] args)
	{
		generateFibonacciSeries(50);
	}
}
