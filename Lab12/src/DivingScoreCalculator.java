import java.util.ArrayList;
import java.util.Scanner;

public class DivingScoreCalculator {

	public static void main(String[] args) {
		
		ArrayList<Float> divingScores = new ArrayList<Float>(7);
		Scanner keyboard = new Scanner(System.in);
		float difficulty;
		float tempScore;
		
		System.out.println("Enter the degree of difficulty for the dive (1.2 - 4.8): ");
		difficulty = keyboard.nextFloat();
		while(difficulty < 1.2 || difficulty > 4.8)
		{
			System.out.println("Invalid difficulty. Please re-enter: ");
			difficulty = keyboard.nextFloat();
		}
		
		System.out.println("Enter the score for each judge (0.0 - 10.0):");
		for(int i = 0; i < 7; i++)
		{
			System.out.println("Enter score for judge " + (i+1));
			tempScore = keyboard.nextFloat();
			while(tempScore < 0 || tempScore > 10)
			{
				System.out.println("Invalid score. Please re-enter: ");
				tempScore = keyboard.nextFloat();
			}
			divingScores.add(i, tempScore);
		}
		
		float high = divingScores.get(0);
		for (int i = 0; i < divingScores.size(); i++)
		{
			if (high < divingScores.get(i))
			{
				high = divingScores.get(i);
			}
		}
		float low = divingScores.get(0);
		for (int i = 0; i < divingScores.size(); i++)
		{
			if (low > divingScores.get(i))
			{
				low = divingScores.get(i);
			}
		}
		double total = 0;
		for (int i = 0; i < divingScores.size(); i++)
		{
			total += divingScores.get(i);
		}
		System.out.println("Score for the dive is: " + (total - (high + low)) * difficulty * 0.6);
		
		
		
		

	}

}
