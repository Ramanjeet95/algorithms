package string;

public class CheckAnagram
{
	public static void main(String[] args) 
	{
		System.out.println(areAnagram("abca", "abacaa"));
	}
	
	static boolean areAnagram(String s1, String s2)
	{
		boolean isAnagram = false;
		if(s1.length() != s2.length()) return isAnagram;
		
		int[] str1Freq = new int[256];
		int[] str2Freq = new int[256];
		
		for(int i = 0; i< s1.length(); i++)
		{
			str1Freq[s1.charAt(i)]++;
			str2Freq[s2.charAt(i)]++;
		}
		
		for(int  i = 0; i< s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(str1Freq[c] != str2Freq[c])
			{
				isAnagram = false;
				break;
			}
			isAnagram = true;
		}
		return isAnagram;
	}
}
