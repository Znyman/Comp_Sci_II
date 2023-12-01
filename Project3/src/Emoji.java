/**
 * Project3
 * @author Zachery Nyman
 * 08 February 2017
 */

public abstract class Emoji {
	
	private double centerX, centerY, radius;
	
	public Emoji(double x, double y, double r)
	{
		centerX = x;
		centerY = y;
		radius = r;
	}
	
	public double getCenterX()
	{
		return centerX;
	}
	
	public double getCenterY()
	{
		return centerY;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public abstract void draw();
	
	public abstract void animate();
	
	
	
	
	
	
	
	
}
