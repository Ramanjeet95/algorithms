package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ArraySubsetIncompatibility 
{
	public static void main(String[] args) {
		minimumIncompatibility(new int[] {1,2,3,4,5,6,1,2}, 2);
	}
	
	 public static int minimumIncompatibility(int[] nums, int k)
	 {
		 Map<Integer, Integer> map = new HashMap<>();
		 IntStream.of(nums).forEach(i -> map.put(i, map.getOrDefault(i, 0)+1));
		 int maxDuplications = (int)map.entrySet().stream().filter(x -> x.getValue() > k).count();
		 if(maxDuplications > k || nums.length%k != 0)
			 return -1;
		 
		 int size = nums.length/k;
		 int[][] subsets = new int[k][];
		 int  count = 0;
		 int index = 0;
		 for(int i = 0; i < nums.length; i++)
		 {
			 if(subsets[index>0?index-1:index] == null || count >= size)
			 {
				 count= 0;
				 subsets[index] = new int[size];
				 subsets[index][count++] = nums[i];
				 index++;
			 }
			 else
			 {
				 int value = map.getOrDefault(nums[i], -1);
				 if(value == 1)
				 {
					 subsets[index-1][count++] = nums[i];
					 map.remove(nums[i]);
				 }
				 else if(value > 1)
				 {
					 Arrays.sort(subsets[index-1]);
					 int x = Arrays.binarySearch(subsets[index-1], nums[i]);
					 if(x < 0)
					 {
						 subsets[index-1][count++] = nums[i];
						 map.put(nums[i], map.get(nums[i])-1);
					 }
				 }
			 }
		 }
		 for(int[] x : subsets)
		 {
			 for(int i : x)
				 System.out.print(i+" ");
			 System.out.println();
		 }
		 return -1;
	}
}
