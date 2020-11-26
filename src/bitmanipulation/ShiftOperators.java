package bitmanipulation;

/*
 * Left Shift operator(<<) multiplies the number with 2 power i times. 
 * e.g. a=6; a<<1;		// =12; (6*2^1)
 * 		a=6; a<<3; 		// =48; (6*2^3)
 * Left Shift operator(<<) multiplies the number with 2 power i times. 
 * e.g. a=6; a>>1;		// =12; (6/2^1)
 * 		a=6; a>>3; 		// =48; (6/2^3)
 */
public class ShiftOperators 
{
	public static void main(String[] args)
	{
		int a = 6;
		//System.out.println(a<<1);
		a=12;
		//System.out.println(a>>2);
		System.out.println(a>>2>>1);
		a=6;
		//System.out.println((double)(a>>3));//still 0
	}
}
