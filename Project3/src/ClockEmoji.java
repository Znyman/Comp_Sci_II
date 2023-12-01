/**
 * Project3
 * @author Zachery Nyman
 * 08 February 2017
 */
import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class ClockEmoji extends Emoji {
	
	private int hour, minute;
	private double xPointMinute, yPointMinute, xPointHour, yPointHour, minuteAngle, hourAngle, radius;
	
	public ClockEmoji(double x, double y, double r, int h, int m)
	{
		super(x, y, r);
		radius = r;
		hour = h;
		minute = m;
		
	}
	
	public void draw()
	{
		minuteAngle = 2*Math.PI/60;
		hourAngle = 2*Math.PI/12;
		xPointMinute = getCenterX() + radius/1.15 * Math.cos((minuteAngle*minute)-Math.toRadians(90));
		yPointMinute = getCenterY() + radius/1.15 * Math.sin((minuteAngle*minute)-Math.toRadians(90));
		xPointHour = getCenterX() + radius/1.85 * Math.cos((hourAngle*hour)-Math.toRadians(90));
		yPointHour = getCenterY() + radius/1.85 * Math.sin((hourAngle*hour)-Math.toRadians(90));
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
		StdDraw.setPenRadius(.02);
		StdDraw.setPenColor(Color.RED);
		//minute hand
		StdDraw.line(getCenterX(), getCenterY(), xPointMinute, yPointMinute);
		//hour hand
		StdDraw.line(getCenterX(), getCenterY(), xPointHour, yPointHour);
	}
	
	public void animate()
	{
		//moves the minute hand ahead one minute and adjusts the hour hand appropriately
		if (minute < 59)
		{
			minute++;
		}
		else {
			hour++;
			if (hour > 23)
			{
				hour = 00;
			}
			minute = 00;
			minute++;
		}
	}
}
