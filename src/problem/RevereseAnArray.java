package problem;

import java.util.stream.Stream;

public class RevereseAnArray
{
	public static void main(String[] args) 
	{
		Integer[] a = new Integer[5];
		for(int i = 0;i<5;i++)
			a[i] = i;
		
		Stream.of(a).forEach(System.out::print);
		ab(a);
		System.out.println();
		Stream.of(a).forEach(System.out::print);
	}
	
	public static void ab(Integer[] a)
	{
		a[4] = 47;
	}
}
