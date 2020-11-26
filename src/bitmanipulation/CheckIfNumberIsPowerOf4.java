package bitmanipulation;

/* A number is power of 4 if its binary representation has only one set bit(power of two)
 * and the number of zeroes after the set bit(towards lsb) is even.
 */
public class CheckIfNumberIsPowerOf4 
{
	public static void main(String[] args) 
	{
		System.out.println(isPowerOf4(64));
	}
	
	static boolean isPowerOf4(int n)
	{
		int zeroBitCount = 0;
		int oneBitCount = 0;
		int temp = 1;
		while(n>0)
		{
			if((n&temp)>0)
				oneBitCount++;
			else
				zeroBitCount++;
			
			n = n>>1;
		}
		return oneBitCount == 1 ? zeroBitCount%2 ==0 ? true:false:false;
	}
	
	
}
