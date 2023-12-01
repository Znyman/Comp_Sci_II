package lab0;

import java.awt.Color;
import java.util.Random;
import edu.princeton.cs.introcs.StdDraw;

public class BouncingBall {
	
	private static final int RADIUS = 20;
	
	private Color color;
	private double xCoord, yCoord;
	private double xVel, yVel;
	private int canvasSize;
	private Random rand = new Random();
	
	public BouncingBall (double x, double y, double vx, double vy, int size)
	{
		xCoord = x;
		yCoord = y;
		xVel = vx;
		yVel = vy;
		canvasSize = size;
		color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}
	
	public void draw()
	{
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(xCoord, yCoord, RADIUS);
	}
	
	public void move()
	{
		xCoord += xVel;
		yCoord += yVel;
		
		if (xCoord < 0 || xCoord > canvasSize)
		{
			xVel *= -1;
		}
		if (yCoord < 0 || yCoord > canvasSize)
		{
			yVel *= -1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
