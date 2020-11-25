package problem;
/*
 * Given two strings, copy one string to other using recursion. 
 * We basically need to write our own recursive version of strcpy in C/C++
 */
public class CopyString 
{
	public static void main(String[] args) 
	{
		String s = "Raman";
		String s2 = copy(s);
		
		System.out.println(s2);
		System.out.println(s == s2);
	}
	
	private static String copy(String s1)
	{
//		String s2 = "";
//		for(int i=0;i<s1.length();i++)
//			s2 = s2+s1.charAt(i);
//		
//		return s2;
		
		return copyRecursive(s1, 0, s1.length() -1);
	}
	
	private static String copyRecursive(String s1, int start, int end)
	{
		if(start == end)
			return s1.charAt(end)+"";

		return s1.charAt(start)+copyRecursive(s1, ++start, end);
	}
}
