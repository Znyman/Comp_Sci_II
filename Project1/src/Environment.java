/**Project1
 * @author Zachery Nyman
 * 12 January 2016
 */

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class Environment {
	
	private static final int CANVAS_SIZE = 800;
	private int numRows, numColumns, neighbor;
	private int[][] grid;
	private Color[][] gridColor;
	Cell[][] cell;
	Random randomNumber = new Random();
	
	
	public Environment(String filename)
	{
		loadFile(filename);
		setupCanvas();
		draw();
	}
	
	private void loadFile(String filename)
    {
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
        numColumns = inFile.nextInt();
        // read in width of image
        numRows = inFile.nextInt();
        System.out.println("Grid size: " + numColumns + " by " + numRows);
        
        grid = new int[numRows][numColumns];
        gridColor = new Color[numRows][numColumns];
        cell = new Cell[numRows][numColumns];
        for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			grid[row][col] = inFile.nextInt();
    			
    			if (grid[row][col] == 1)
    			{
    				cell[row][col] = new Cell(true);
    			}
    			else
    			{
    				cell[row][col] = new Cell(false);
    			}
    		}
    	}
        System.out.println();
    }
	
	private void setupCanvas()
    {        
        StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE); // (width, height)
        StdDraw.setXscale(-(numColumns/numColumns), numColumns);
        //flip y scale so it matches array!!!
        StdDraw.setYscale(numRows, -(numRows/numRows));
        // start animation mode
        StdDraw.show(0);
    }
	
	public void draw()
    {
    	StdDraw.clear();
    	for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			if (cell[row][col].isOccupied())
    			{
    				int red, green, blue;
    				red = randomNumber.nextInt(256);
    				green = randomNumber.nextInt(256);
    				blue = randomNumber.nextInt(256);
    				gridColor[row][col] = new Color(red, green, blue);
        			StdDraw.setPenColor(gridColor[row][col]);
        			StdDraw.filledSquare(col, row, .5);
    			}
    			else
    			{
    				StdDraw.setPenColor(StdDraw.WHITE);
        			StdDraw.filledSquare(col, row, .51);
    			}
    		}
    	}
    	StdDraw.show(500);
    }
	
	public void runSimulation()
	{
		checkTopLeftCorner();
		checkBottomLeftCorner();
		checkTopRightCorner();
		checkBottomRightCorner();
		checkGridMinusEdges();
		checkTopEdge();
		checkRightEdge();
		checkBottomEdge();
		checkLeftEdge();
	}
	
	//any cell changed to "true" is the new generation based on the provided conditions.
	
	//any cell changed to "false" dies based on the provided conditions.
	
	private void checkTopLeftCorner()
	{
		for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			if (cell[row][col].isOccupied() && row == 0 && col == 0)
    			{
    				neighbor = 0;
    				
    				if (cell[row][col+1].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row+1][col+1].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row+1][col].isOccupied())
        			{
        				neighbor++;
        			}

        			if (neighbor < 2)
        			{
        				cell[row][col] = new Cell(false);
        			}
        			if (neighbor > 1 && neighbor < 4)
        			{
        				cell[row][col] = new Cell(true);
        			}
        			if (neighbor > 3)
        			{
        				cell[row][col] = new Cell(false);
        			}
    			}
    			if (!cell[row][col].isOccupied() && row == 0 && col == 0)
    			{
    				neighbor = 0;
    				
    				if (cell[row][col+1].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row+1][col+1].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row+1][col].isOccupied())
        			{
        				neighbor++;
        			}

        			if (neighbor == 3)
        			{
        				cell[row][col] = new Cell(true);
        			}
    			}
    		}
    	}
	}
	
	private void checkBottomLeftCorner()
	{
		for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			if (cell[row][col].isOccupied() && row == numRows-1 && col == 0)
    			{
    				neighbor = 0;
    				
    				if (cell[row-1][col].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row-1][col+1].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row][col+1].isOccupied())
        			{
        				neighbor++;
        			}

        			if (neighbor < 2)
        			{
        				cell[row][col] = new Cell(false);
        			}
        			if (neighbor > 1 && neighbor < 4)
        			{
        				cell[row][col] = new Cell(true);
        			}
        			if (neighbor > 3)
        			{
        				cell[row][col] = new Cell(false);
        			}
    			}
    			if (!cell[row][col].isOccupied() && row == numRows-1 && col == 0)
    			{
    				neighbor = 0;
    				
    				if (cell[row-1][col].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row-1][col+1].isOccupied())
        			{
        				neighbor++;
        			}
        			if (cell[row][col+1].isOccupied())
        			{
        				neighbor++;
        			}

        			if (neighbor == 3)
        			{
        				cell[row][col] = new Cell(true);
        			}
    			}
    		}
    	}
		
	}
	
	private void checkTopRightCorner()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row == 0 && col == numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row == 0 && col == numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
			}
		}
	}
	
	private void checkBottomRightCorner()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row == numRows-1 && col == numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row == numRows-1 && col == numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
				
			}
		}
	}
	
	private void checkGridMinusEdges()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row != 0 && col != 0 && row != numRows-1 && col != numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row != 0 && col != 0 && row != numRows-1 && col != numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
			}
		}
	}
	
	private void checkTopEdge()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row == 0 && col > 0 && col < numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row == 0 && col > 0 && col < numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
			}
		}
	}
	
	private void checkRightEdge()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row > 0 && row < numRows-1 && col == numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row > 0 && row < numRows-1 && col == numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col-1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
			}
		}
	}
	
	private void checkBottomEdge()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row == numRows-1 && col > 0 && col < numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row == numRows-1 && col > 0 && col < numColumns-1)
				{
					neighbor = 0;
					
					if (cell[row-1][col-1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col].isOccupied())
					{
						neighbor++;
					}
					if (cell[row-1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
			}
		}
	}
	
	private void checkLeftEdge()
	{
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numColumns; col++)
			{
				if (cell[row][col].isOccupied() && row > 0 && row < numRows-1 && col == 0)
				{
					neighbor = 0;
					
					if (cell[row-1][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor < 2)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
	    			if (neighbor > 1 && neighbor < 4)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
	    			if (neighbor > 3)
	    			{
	    				cell[row][col] = new Cell(false);
	    			}
				}
				if (!cell[row][col].isOccupied() && row > 0 && row < numRows-1 && col == 0)
				{
					neighbor = 0;
					
					if (cell[row-1][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row][col+1].isOccupied())
					{
						neighbor++;
					}
					if (cell[row+1][col+1].isOccupied())
					{
						neighbor++;
					}

					if (neighbor == 3)
	    			{
	    				cell[row][col] = new Cell(true);
	    			}
				}
			}
		}
	}
}
