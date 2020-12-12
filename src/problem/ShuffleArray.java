package problem;

public class ShuffleArray 
{
	public static void main(String[] args)
	{
		int[] a = {2,5,1,3,4,7}; int n = 3;
		for(int ns : shuffle(a, n))
		{
			System.out.print(ns + " ");
		}
	}
	
	public static int[] shuffle(int[] nums, int n) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < n; i++)
			arr[i * 2] = nums[i];

		for (int i = 1; i <= n; i++)
			arr[i * 2 - 1] = nums[i + n - 1];
		return arr;
	}
}
