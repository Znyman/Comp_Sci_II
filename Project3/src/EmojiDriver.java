/**
 * Project3
 * @author Zachery Nyman
 * 08 February 2017
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;

public class EmojiDriver {
	
public static final int CANVAS_SIZE = 950;
private static int numRows, numColumns, hour, minute;
private static String emojiClassification;
	
	public static void main(String[] args) 
	{
		String filename = "emoji1.txt";
		Scanner inFile = null;
        try
        {
            inFile = new Scanner(new FileInputStream(filename));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Cannot open file: " + filename);
            System.exit(0);
        }
        
        // read in height of image
        numRows = inFile.nextInt();
        // read in width of image
        numColumns = inFile.nextInt();
        System.out.println("Grid size: " + numRows + " rows by " + numColumns + " columns");
		
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setScale(0, numColumns);
		StdDraw.setXscale(0, numColumns);
		StdDraw.setYscale(numRows, 0);
		
		Emoji[][] emoji = new Emoji[numRows][numColumns];
		double radius = 0.5;
		for(int i = 0; i < numRows; i++)
		{
			for(int j = 0; j < numColumns; j++)
			{
				emojiClassification = inFile.next();
				if(emojiClassification.equals("clock"))
				{
					hour = inFile.nextInt();
					minute = inFile.nextInt();
					emoji[i][j] = new ClockEmoji(j+.5, i+.5, radius, hour, minute);
				}
				if(emojiClassification.equals("smile"))
				{
					emoji[i][j] = new SmileyFaceEmoji(j+.5, i+.5, radius);
				}
				if(emojiClassification.equals("frown"))
				{
					emoji[i][j] = new FrowningFaceEmoji(j+.5, i+.5, radius);
				}
			}
		}
		while(true)
		{
			StdDraw.clear();
			for(int i = 0; i < numRows; i++)
			{
				for(int j = 0; j < numColumns; j++)
				{
					emoji[i][j].draw();
					emoji[i][j].animate();
				}
			}
			StdDraw.show(500);
		}
	}

		
		
}


