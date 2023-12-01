/**
 * 05 January 2016
 * @author Zachery Nyman
 * Lab01
 */

public class BubbleSort {
	
	public static void sort (double[] a, int numberUsed)
	{
		//bubble sort algorithm
		boolean sorted = isSorted (a, numberUsed);
		
		while (!sorted)
		{
			int index;
			for (index = 0; index < numberUsed - 1; index++)
			{
			       if (a[index] > a[index + 1])
			       {
			    	   interchange(index, index + 1, a);
			       }
			             //Interchange the values of a[index] and a[index + 1]
			}
			sorted = isSorted (a, numberUsed);
		}
	}
	
	private static boolean isSorted (double[] a, int numberUsed)
	{
		for (int index = 0; index < numberUsed - 1; index++)
		{
			if (a[index] > a[index + 1])
			{
				 return false;
			}
		}
		return true;
	}
	
	private static void interchange(int i, int j, double[] a)
    {
        double temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp; //original value of a[i]
    }
	

}
