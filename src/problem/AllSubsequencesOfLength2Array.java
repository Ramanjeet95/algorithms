package problem;

public class AllSubsequencesOfLength2Array 
{
	public static void printSize2Subsets(int[] nums) {
		int size = fact(nums.length) / (fact(nums.length - 2) * fact(2));
		int[][] sub = new int[size][2];

		int z = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int[] ele = sub[z++];
				ele[0] = nums[i];
				ele[1] = nums[j];
			}
		}
		for (int[] a1 : sub) {
			for (int s : a1)
				System.out.print(s + " ");
			System.out.println();
		}
	}

	private static int fact(int n) 
	{
		if (n == 1)
			return 1;
		return n * fact(n - 1);
	}

	public static void main(String[] args) 
	{
		int[] a = { 23, 12, 5, 2, 1, 7 };
		printSize2Subsets(a);
	}
}
