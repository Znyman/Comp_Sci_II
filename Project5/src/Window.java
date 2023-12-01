/**Project 05
 * @author Zachery Nyman
 * 08 March 2017
 */

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Window {
	
	private double x, y, width, height;
	private Color windowColor;
	
	public Window(double initialX, double initialY, double initialWidth, double initialHeight, Color initialColor)
	{
		x = initialX;
		y = initialY;
		width = initialWidth;
		height = initialHeight;
		windowColor = initialColor;
	}
	
	public void draw()
	{
		StdDraw.setPenColor(windowColor);
		StdDraw.filledRectangle(x, y, width/2, height/2);
	}
	
	public boolean containsPoint(double clickedX, double clickedY)
	{
		double topEdge = y + (height/2);
		double bottomEdge = y - (height/2);
		double leftEdge = x - (width/2);
		double rightEdge = x + (width/2);
		
		if(clickedX >= leftEdge && clickedX <= rightEdge && clickedY <= topEdge && clickedY >= bottomEdge)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
