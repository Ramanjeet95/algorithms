package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers arr and an integer k.

A value arr[i] is said to be stronger than a value arr[j] if |arr[i] - m| > |arr[j] - m| where m is the median of the array.
If |arr[i] - m| == |arr[j] - m|, then arr[i] is said to be stronger than arr[j] if arr[i] > arr[j].

Return a list of the strongest k values in the array. return the answer in any arbitrary order.

Median is the middle value in an ordered integer list. More formally, if the length of the list is n, the median is the element in position ((n - 1) / 2) in the sorted list (0-indexed).

For arr = [6, -3, 7, 2, 11], n = 5 and the median is obtained by sorting the array arr = [-3, 2, 6, 7, 11] and the median is arr[m] where m = ((5 - 1) / 2) = 2. The median is 6.
For arr = [-7, 22, 17, 3], n = 4 and the median is obtained by sorting the array arr = [-7, 3, 17, 22] and the median is arr[m] where m = ((4 - 1) / 2) = 1. The median is 3.
 */
public class FindStrongestElementInArray 
{
	public static void main(String[] args)
	{
		int arr[] = {1,1,3,5,5};/*{6,7,11,7,6,8};*///{1,2,3,4,5};//{-7,22,17,3};
		int k = 2;
		for(int x : getStrongest(arr, k))
			System.out.print(x+" ");
	}
	
	private static int[] getStrongest(int[] arr, int k)
	{
		List<Pair> list = new ArrayList<>();	
		int m = findMedian(arr, arr.length);
		for(int i = 0; i < arr.length; i++)
		{
			int x = arr[i] - m;
			if(x<0)
				x = -x;
			
			Pair p = list.stream().min((o1,o2)->o1.getResult() < o2.getResult() ? -1 : o1.getResult() > o2.getResult() ? 1 : 0).orElse(null);
			
			if(p == null || list.size() < k)
				list.add(new Pair(arr[i], x));
			else if(p.getResult() < x)
			{
				list.add(new Pair(arr[i], x));
				if(list.size() >= k)
					list.remove(p);
			}
			else if(p.getResult() == x)
			{
				if(p.getNum() < arr[i])
				{
					list.add(new Pair(arr[i], x));
					if(list.size() >= k)
						list.remove(p);	
				}
			}
		}
		return list.stream().mapToInt(p->p.getNum()).toArray();
	}
	
	private static int findMedian(int[] arr, int size)
	{
		Arrays.sort(arr, 0, size);
		return arr[(size-1)/2];
	}
}

class Pair
{
	private int num;
	private int result;
	
	Pair(int num, int result)
	{
		this.num = num;
		this.result = result;
	}

	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public int getResult() 
	{
		return result;
	}

	public void setResult(int result) 
	{
		this.result = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		result = prime * result + this.result;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (num != other.num)
			return false;
		if (result != other.result)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[num=" + num + ", result=" + result + "]";
	}
}
