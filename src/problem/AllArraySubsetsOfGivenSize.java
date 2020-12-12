package problem;

public class AllArraySubsetsOfGivenSize 
{
	public static void main(String[] args) 
	{
		int arr[] = {6,12,23,5,7,1};
		for(int[] a : findSubsets(arr, 3))
		{
			for(int n : a)
				System.out.print(n + " ");
		}
	}
	
	static int[][] findSubsets(int[] arr, int k)
	{
		int size = fact(arr.length)/(fact(arr.length-k)*fact(k));
		int[][] subsets = new int[size][k];
		for(int i = 0; i < arr.length; i++)
		{
			int[] s = subsets[i];
			int count = 0;
			s[count++] = arr[i];
			for(int j = i+1; j < arr.length ; j++,count++)
			{
				if(count > k)
					break;
				s[count] = arr[j];
			}
		}
		return subsets;
	}
	
	private static int fact(int n)
	{
		if(n == 1)
			return 1;
		return n*fact(n-1);
	}
}
