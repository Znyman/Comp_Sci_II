package lab0;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class Lab0Driver {
	
	public static final int CANVAS_SIZE = 400;

	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		Random randomNumber = new Random();
		//StdDraw.setYscale(CANVAS_SIZE, 0); flip direction (scale) for PP1
		
		BouncingBall[] ball = new BouncingBall[50];
		
		for (int i = 0; i < ball.length; i++)
		{
			int xCoordinate = randomNumber.nextInt(CANVAS_SIZE+1);
			int yCoordinate = randomNumber.nextInt(CANVAS_SIZE+1);
			int xSpd = randomNumber.nextInt(6)+1;
			int ySpd = randomNumber.nextInt(6)+1;
			ball[i] = new BouncingBall(xCoordinate, yCoordinate, xSpd, ySpd, CANVAS_SIZE);
		}

		
		while(true)
		{
			StdDraw.clear();
			for (int i = 0; i < ball.length; i++)
			{
				ball[i].move();
				ball[i].draw();
			}
			StdDraw.show(20);
		}

	}

}
