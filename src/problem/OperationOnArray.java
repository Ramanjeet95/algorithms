package problem;

import java.util.HashMap;
import java.util.Map;

public class OperationOnArray 
{
	public static void main(String[] args) {
	
		System.out.println(maxOperations(new int[] {2,2,2,3,1,1,4,1}, 4));
	}
	public static int maxOperations(int[] nums, int k) 
    {
		int count = 0;	
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        
        for(int i = 0; i < nums.length; i++)
        {
        	 int freq = map.getOrDefault(nums[i], -1);
             int complementFreq = map.getOrDefault(k-nums[i], -1);
             if(complementFreq != -1 && freq != -1)
            {
                if(nums[i] != k-nums[i])
                    count+=Math.min(freq, complementFreq);
                else
                    count+=freq/2;
                
                 map.remove(nums[i]);
                 map.remove(k-nums[i]);
            }
        }
		return count;
    }
}
