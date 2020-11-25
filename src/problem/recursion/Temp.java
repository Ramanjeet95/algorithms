package problem.recursion;

public class Temp 
{
	static void fun1(int n)  
	{  
	   int i = 0;    
	   if (n > 1)  
	     fun1(n - 1);  
	   for (i = 0; i < n; i++)  
	     System.out.print(" * ");  
	}  
	
	static void fun(int x)  
    {  
        if(x > 0)  
        {  
            fun(--x);  
            System.out.print(x + " ");  
            fun(--x);  
        }  
    }  
	/*
	 fun(4) x = 4;
	 fun(3) x = 3; 
	 fun(2) x = 2;
	 	2
	 //fun(1) x = 1;
	 	//fun(0)
	 	sop(1)
	 	//fun(0)
		// fun(0) x = 0;
	 
	 
	
	 
	 
	 
	*/
	public static void main(String[] args)
	{
		fun(10);
	}
}


