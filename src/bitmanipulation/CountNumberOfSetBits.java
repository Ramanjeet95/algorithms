package bitmanipulation;

public class CountNumberOfSetBits 
{
	public static void main(String[] args) 
	{
		System.out.println(countSetBits2(12));
	}
	
	static int countSetBits(int n)
	{
		int temp = 1;			//00000001
		int count = 0;
		while(n != 0)
		{
			if((n&temp) != 0)	//n&00000001 will return in 0 for every o lsb bit
				count++;
			n = n>>1;
		}
		return count;
	}
	
	//In this approach we perform & operation between n and n-1 repeatedly until n becomes 0.
	//Every time we perform & operation between n & n-1 we remove the right most set bit. 
	static int countSetBits2(int n)
	{
		int temp = 1;			//00000001
		int count = 0;
		while(n != 0)
		{
			n = n&n-1;
			count++;
		}
		return count;
	}
}
