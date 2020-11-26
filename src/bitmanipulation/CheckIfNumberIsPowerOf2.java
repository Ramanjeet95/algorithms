package bitmanipulation;

//If number is power of 2, it will only have one bit set in binary representation
public class CheckIfNumberIsPowerOf2 
{
	public static void main(String[] args) 
	{
		int n = 22;
		System.out.println(isPowerOf2(0));
	}
	
	private static boolean isPowerOf2(int n)
	{
		//return countSetBits(n) == 1;
		if(n<0) return false;
		
		// Thought is that if n & n-1 is 0, it means there was only one set bit. This is because & of n and n-1
		//removes the right most set bit.
		return (n&(n-1)) == 0;
	}	
	
	//By counting bits,approach 1
	private static int countSetBits(int n)
	{
		int i = 1;
		int count = 0;
		
		while (n>0)
		{
			if((n&i)>0)
				count++;
			
			n = n>>1;
		}
		return count;
	}
	//By counting bits,approach 2
	private static int countSetBits2(int n)
	{
		int count = 0;
		
		while (n>0)
		{
			n = n & n-1;
			count++;
		}
		return count;
	}
}
