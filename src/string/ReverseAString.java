package string;

public class ReverseAString 
{
	public static void main(String[] args) {
		char c[] = {'h','e','l','l','o'};
		int size = c.length;
		char temp = ' ';
		for(int i = 0; i < size/2; i++)
		{
			temp = c[i];
			c[i] = c[size-i-1];
			c[size-i-1] = temp;
		}
		System.out.println(new String(c));
	}
}
