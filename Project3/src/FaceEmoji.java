/**
 * Project3
 * @author Zachery Nyman
 * 08 February 2017
 */

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.util.Random;

public abstract class FaceEmoji extends Emoji {
	
	private boolean isWinking;
	private int winkingIndicator;
	private Random winkingGenerator = new Random();
	
	public FaceEmoji(double x, double y, double r)
	{
		super(x, y, r);
	}
	
	public void draw()
	{
		//face
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
		//left eye
		if(isWinking)
		{
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledCircle(getCenterX()-.2, getCenterY()-.2, getRadius()/6);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.setPenRadius(.01);
			StdDraw.arc(getCenterX()-.2, getCenterY()-.2, getRadius()/10, 180, 360);
		}
		if(!isWinking)
		{
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledCircle(getCenterX()-.2, getCenterY()-.2, getRadius()/6);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledCircle(getCenterX()-.2, getCenterY()-.2, getRadius()/10);
		}
		//right eye
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(getCenterX()+.2, getCenterY()-.2, getRadius()/6);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(getCenterX()+.2, getCenterY()-.2, getRadius()/10);
	}
	
	public void animate()
	{
		winkingIndicator = winkingGenerator.nextInt(2);
		if(winkingIndicator == 0);
		{
			isWinking = false;
		}
		if(winkingIndicator == 1)
		{
			isWinking = true;
		}
	}
	
	
	
	
}
