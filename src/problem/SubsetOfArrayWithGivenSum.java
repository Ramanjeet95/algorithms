package problem;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array and an expectedSum, find all the subsets of the array with sum equals expectedSum. 
 */
public class SubsetOfArrayWithGivenSum 
{
	public static void main(String[] args)
	{
		int[] array = {1,2,5,4,8,3,7};
		int expectedSum = 7;
		for(int i = 0; i < array.length; i++)
		{
			int sum = 0;
			List<Integer> subset = new ArrayList<>();
			if(array[i] > expectedSum) continue;
			else if(array[i] == expectedSum) 
			{
				System.out.println("["+array[i]+"]");
				continue;
			}
			sum = array[i];
			subset.add(array[i]);
			
			for(int j = i + 1; j < array.length - 1; j++)
			{
				if(array[j] > 7) continue;
				sum+=array[j];
				subset.add(array[j]);
				if(sum == expectedSum)
				{
					System.out.println(subset);
					sum-=array[j];
					subset.remove((Integer)array[j]);
				}
				else if(sum > expectedSum)
				{
					sum-=array[j];
					subset.remove((Integer)array[j]);
				}
			}
			subset.remove((Integer)array[i]);
		}
	}
}
