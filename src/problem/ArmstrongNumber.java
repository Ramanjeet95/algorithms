package problem;

/*
 * Check whether given 3 digit number is armstrong or not. A number is armstrong if number's sum of digits cubed is the number itself.
 */
public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		int n = 371;
		System.out.println(isArmstrong(n));
	}
	
	private static String isArmstrong(int n)
	{
		int a = n/100;
		int b = (n/10)%10;
		int c = n%10;
		
		return (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == n ? "Yes" : "No"; 
	}
}
