package loadeddice;
import java.util.Random;

public class LoadedDice extends Random {
	
	public LoadedDice()
	{
		super();
	}
	
	
	public int nextInt(int num)
	{
		int val = super.nextInt(2);
		if(val == 0)
		{
			return super.nextInt(num);
		}
		else
		{
			return num - 1;
		}
		
	}
	

}
