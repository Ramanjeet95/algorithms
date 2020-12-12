package problem;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import util.LinkedList;

public class ReverseLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.reverse();
		list.forEach(System.out::println);
	}
	
}
