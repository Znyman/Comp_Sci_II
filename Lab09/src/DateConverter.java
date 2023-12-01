/**
 * Lab09
 * @author Zachery Nyman
 * 9 February 2017
 */

import java.util.Scanner;

public class DateConverter {
	
	private static String monthName;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		
		do
		
		{
		
			System.out.println("Enter an integer representing the month: ");
		
			int month = keyboard.nextInt();
			
			System.out.println("Enter an integer representing the day: ");
			
			int day = keyboard.nextInt();
			
			DateConverter.convert(month, day);
			
			System.out.println();
			
			System.out.println("Do you want to convert another date? Enter Y or N");
			
			answer = keyboard.next();
		
		} while (answer.equalsIgnoreCase("Y"));

	}
	
	public static void convert(int month, int day)
	{
		try
		{
			if(month < 1 || month >12)
			{
				throw new MonthException("MonthException\nYou must enter a vaild month. Example: 1 - 12.");
			}
			if(month == 2)
			{
				if(month == 2)
				{
					monthName = "February";
				}
				if(day < 0 || day > 28)
				{
					throw new DayException("DayException\nInvalid day for the given month.");
				}
			}
			if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				if(month == 4)
				{
					monthName = "April";
				}
				
				if(month == 6)
				{
					monthName = "June";
				}
				if(month == 9)
				{
					monthName = "September";
				}
				
				if(month == 11)
				{
					monthName = "November";
				}
				if(day < 0 || day > 30)
				{
					throw new DayException("DayException\nInvalid day for the given month.");
				}
			}
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				if(month == 1)
				{
					monthName = "January";
				}
				if(month == 3)
				{
					monthName = "March";
				}
				if(month == 5)
				{
					monthName = "May";
				}
				if(month == 7)
				{
					monthName = "July";
				}
				if(month == 8)
				{
					monthName = "August";
				}
				if(month == 10)
				{
					monthName = "October";
				}
				if(month == 12)
				{
					monthName = "December";
				}
				if(day < 0 || day > 31)
				{
					throw new DayException("DayException\nInvalid day for the given month.");
				}
			}
			System.out.println(monthName + " " + day);
		}
		catch(DayException e)
		{
			System.out.println(e.getMessage());
		}
		catch(MonthException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
