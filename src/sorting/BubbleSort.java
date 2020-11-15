package sorting;

import java.util.Arrays;

/*
 * Bubble sort is a sorting algorithm.In this elements are bubbled up to the right.
 * We compare each element with its next and if its bigger than the next, we swap.
 * We keep repeating until there are o swaps.
 */
public class BubbleSort
{
	public void sort(int[] arr, int size)
	{
		int swaps = -1;
		int count = 0;
		while(swaps != 0)
		{
			swaps = 0;
			for(int i = 0; i < size - count - 1; i++)
			{
				if(arr[i] > arr[i + 1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swaps++;
				}
			}
			count++;
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {23, 1, 0, 44, 11, 2, 86};
		new BubbleSort().sort(arr, arr.length);
		Arrays.stream(arr).forEach(System.out::println);
	}
}
