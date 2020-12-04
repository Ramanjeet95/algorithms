package problem;

import java.util.Scanner;

public class FindSubarrayWithSum 
{
	 public static void main (String[] args)
		{
		    Scanner in = new Scanner(System.in);
		    int testCases = in.nextInt();
		    while(testCases != 0)
		    {
		        int size = in.nextInt();
		        int sum = in.nextInt();
		        int arr[] = new int[size];
		        for(int i = 0; i < size; i++)
		            arr[i] = in.nextInt(); 
		        printSubArrayIndicies2(arr, sum);     
		        testCases--;
		    }
		}
		static void printSubArrayIndicies(int[] arr, int sum)
		{
		    for(int i = 0; i<arr.length; i++)
		    {
		    	int temp = 0;
		        for(int j = i; j< arr.length; j++)
		        {
		            temp+=arr[j]; 
		            if(temp == sum)
		            {
		                System.out.print(i+" "+j);
		                System.out.println();
		                return;
		            }
		        }
		    }
		    System.out.print(-1);
		}
		
		static void printSubArrayIndicies2(int[] arr, int sum)
		{
			int temp = arr[0];
			int start = 0;
		    for(int i = 1; i<arr.length; i++)
		    {
		    	while(temp > sum && start<arr.length)
		    	{
		    		temp = temp - arr[start];
		    		start++;
		    	}
		    	if(temp == sum)
		    	{
		    		System.out.println((start+1)+" "+i);
		    		return;
		    	}
		    	temp += arr[i];
		    }
		    System.out.print(-1);
		}
//{1,2,3,4,5,6,7,8,9}	
}
