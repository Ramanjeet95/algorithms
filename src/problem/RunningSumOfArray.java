package problem;

public class RunningSumOfArray
{
	public static void main(String[] args) {
		

	}
	 public static int[] runningSum(int[] nums) 
	    {
	        int[] arr = new int[nums.length];
	        int sum = nums[0];
	        arr[0] = sum;
	        for(int i = 1;i<nums.length;i++)
	        {
	            arr[i]=sum += nums[i];
	        }
	        return arr;
	    }
}
