package problem.recursion;

public class Factorial 
{
	static int fact(int n)
	{
		if(n<=0)
			return 1;
		return n*fact(n-1);
	}
	
	static int factTailRecursion(int n, int product)
	{
		if(n<=0)
			return product;
		return factTailRecursion(n-1, product*n);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(factTailRecursion(7, 1));
	}
}
