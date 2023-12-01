
public class Recursion {
	
	public static void writeStarsIteratively(int n)
	{
		for(int i = n; i > 0; i--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void writeStarsRecursively(int n)
	{
		//base case
		if(n == 0)
		{
			System.out.println();
		}
		else
		{
			System.out.print("*");
			writeStarsRecursively(n-1);
		}
	}
	
	public static void reverse(String s)
	{
		if(s.length() == 0)
		{
			// do nothing
		}
		else
		{
			reverse(s.substring(1, s.length()));
			System.out.print(s.charAt(0));
		}
	}
	
	public static void reverseInt(int n)
	{
		if(n < 10)
		{
			System.out.print(n);
		}
		else
		{
			System.out.print(n%10);
			reverseInt(n/10);
		}
	}
	
	public static long factorial(long n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
	
	public static int sumOfSquares(int k)
	{
		if(k == 0)
		{
			return 0;
		}
		else
		{
			return (k * k) + (sumOfSquares(k-1));
		}
	}
	
	public static int fib(int n)
	{
		if(n > 2)
		{
			return fib(n-2) + fib(n-1);
		}
		else
		{
			return 1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
