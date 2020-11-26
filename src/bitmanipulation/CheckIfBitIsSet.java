package bitmanipulation;

//We take a number equals to one and calculate left shift on that number i times and then
//& the result with the number whose i'th bit is to be checked. If & result is 0 the bit is
//not set else the bit is set 
public class CheckIfBitIsSet 
{
	public static void main(String[] args)
	{
		int n = 12;
		int i = 0;
		int s = 1<<i;
		System.out.println();
		System.out.println(n&s);
		
	}
}
