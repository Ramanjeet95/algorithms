package problem;

public class AllPossibleStringsFromCharSet
{
	public static void main(String[] args)
	{
		char[] array = {'a', 'b'};
		int k = 3;
		
		//a[0]+a[0]+a[0]
		//a[0]+a[0]+a[1]
		//a[0]+a[1]+a[1]
		//a[1]+a[1]+a[1]
		//a[1]+a[0]+a[0]
		//a[1]+a[1]+a[0]
		//a[0]+a[1]+a[0]
		//a[1]+a[0]+a[1]
		for(int i = 0; i<array.length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				for(int z = 0; z < array.length; z++)
				{
					String s = ""+array[i]+array[j]+array[z];
					System.out.println(s);
				}
			}
		}
	}
}
