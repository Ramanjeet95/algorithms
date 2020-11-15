package problem;

public class PallindromeNumber
{
	 public String is_palindrome(int n)
	    {
	        // Code here
	        String s = String.valueOf(n);
	        for(int i = 0; i < s.length()/2; i++)
	        {
	            if(s.charAt(i) != s.charAt(s.length()-i-1))
	                return "No";
	        }
	        return "Yes";
	    }
}
