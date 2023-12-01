package loadeddice;

import java.util.Random;

public class LoadedDiceDriver {

	public static final int MAX_VALUE = 6;
	
	public static void main(String[] args) {

		Random ranGen1 = new Random();
		LoadedDice ranGen2 = new LoadedDice();
		diceRolls(ranGen2);
		
		
		
		

	}
	
	public static void diceRolls(Random randGenerator)
	{
		int[] rollCount = new int[MAX_VALUE+1];
		for(int i = 0; i < MAX_VALUE + 1; i++)
		{
			rollCount[i] = 0;
		}
		
		for(int i = 0; i < 100; i++)
		{
			int roll = randGenerator.nextInt(MAX_VALUE)+1;
			rollCount[roll]++;
		}
		
		for(int i = 1; i <= MAX_VALUE; i++)
		{
			System.out.println(i + "	" + rollCount[i]);
		}
		
	}
	

}
