/**
 * Project2
 * @author Zachery Nyman
 * 26 January 2017
 */

package unstddraw;

import java.awt.Color;
import java.util.Random;
import edu.princeton.cs.introcs.StdDraw;

public class UnStdDraw {
	
	private static final Color SEA_FOAM_GREEN = new Color(100, 200, 150);
	private static final Color BLOOD_RED = new Color(255, 50, 50);
	private static final Color PURPLE = new Color(150, 100, 255);
	private static Random randomNumber = new Random();
	private static int polygonCounter;
	private static int spiralCounter;
	private static Color color;
	
	static void filledRegularPolygon(int centerX, int centerY, int radius, int numSides)
	{
		polygonCounter++;
		
		setColor();
		double angle = (2*Math.PI)/numSides;//
		double[] xPoint = new double[numSides];
		double[] yPoint = new double[numSides];
		
		for(int i = 0; i < numSides; i++)
		{
			xPoint[i] = centerX	+ radius*Math.cos(angle*(i+1));
			yPoint[i] = centerY + radius*Math.sin(angle*(i+1));
		}
		
		StdDraw.setPenColor(color);
		StdDraw.filledPolygon(xPoint, yPoint);
	}
	
	static void spiral(int centerX, int centerY, int maxRadius, int numCoils, int numSegmentsPerCoil)
	{
		spiralCounter++;
		
		StdDraw.setPenRadius(0.01);
		double angle = (2*Math.PI)/numSegmentsPerCoil;//
		int coilSpacing = maxRadius/numCoils;
		double initialXPoint = centerX;
		double initialYPoint = centerY;
		double newXPoint, newYPoint;
		
		for(int i = 0; i < numCoils*numSegmentsPerCoil; i++)
		{
			setColor();
			initialXPoint = centerX + (i*coilSpacing/numSegmentsPerCoil)*Math.cos(angle*i);
			initialYPoint = centerY + (i*coilSpacing/numSegmentsPerCoil)*Math.sin(angle*i);
			newXPoint = centerX + ((i+1)*coilSpacing/numSegmentsPerCoil)*Math.cos(angle*(i+1));
			newYPoint = centerY + ((i+1)*coilSpacing/numSegmentsPerCoil)*Math.sin(angle*(i+1));
			StdDraw.setPenColor(color);
			StdDraw.line(initialXPoint, initialYPoint, newXPoint, newYPoint);
		}
	}
	
	private static void setColor()
	{
		int colorDetermination = randomNumber.nextInt(3);
		
		if(colorDetermination == 0)
		{
			color = SEA_FOAM_GREEN;
		}
		if(colorDetermination == 1)
		{
			color = BLOOD_RED;
		}
		if(colorDetermination == 2)
		{
			color = PURPLE;
		}
	}
	
	public static int getPolygonCounter()
	{
		return polygonCounter;
	}
	
	public static int getSpiralCounter()
	{
		return spiralCounter;
	}
	

}
