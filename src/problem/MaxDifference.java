package problem;

public class MaxDifference {
	public static void main(String[] args) {
		System.out.println(maxDiff(111));
	}

	public static int maxDiff(int num)
    {
        int x = 0;
		char[] stringNum = String.valueOf(num).toCharArray();
        for(int i = 0; i<stringNum.length;i++)
        {
            if(stringNum[i]-'0' != 9)
            {
                x=stringNum[i]-'0';
                for(int j = i; j < stringNum.length; j++)
                {
                    if(stringNum[j]-'0' == x)
                        stringNum[j] = '9';
                }
                break;
            }
        }
        int a = Integer.parseInt(new String(stringNum));
        stringNum = String.valueOf(num).toCharArray();
        x=0;
        
        if(stringNum[0]-'0' > 1)
        {
            x = stringNum[0]-'0';
            for(int j = 0; j < stringNum.length; j++)
            {
               if(stringNum[j]-'0' == x)
                  stringNum[j] = '1';
            }
        }
        else
        {
            for(int  i = 1; i< stringNum.length; i++)
            {
                if(stringNum[i]-'0' > 1)
                {
                    x = stringNum[i]-'0';
                    for(int j = i; j < stringNum.length; j++)
                    {
                       if(stringNum[j]-'0' == x)
                           stringNum[j] = '0';
                    }
                    break;
                }
            }
        }
        int b = Integer.parseInt(new String(stringNum));
	    return a-b;      
    }
}
