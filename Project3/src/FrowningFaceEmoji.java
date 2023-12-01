/**
 * Project3
 * @author Zachery Nyman
 * 08 February 2017
 */
import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class FrowningFaceEmoji extends FaceEmoji {
	
	public FrowningFaceEmoji(double x, double y, double r)
	{
		super(x, y, r);
	}
	
	public void draw()
	{
		super.draw();
		StdDraw.setPenRadius(.03);
		StdDraw.arc(getCenterX(), getCenterY()+.3, getRadius()/1.5, 0, 180);
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(.01);
		StdDraw.arc(getCenterX(), getCenterY()+.3, getRadius()/1.5, 0, 180);
	}
	
	
}
