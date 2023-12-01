/**
 * Project2
 * @author Zachery Nyman
 * 26 January 2017
 */

package unstddraw;

import edu.princeton.cs.introcs.StdDraw;

public class UnStdDrawDriver {

	public static final int CANVAS_SIZE = 1000;
	
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		
		int x = 850;
		int y = 850;
		int radius = 100;
		int numSides = 7;
		int x1 = 250;
		int y1 = 250;
		int radius1 = 250;
		int numSides1 = 14;
		int x2 = 500;
		int y2 = 500;
		int radius2 = 75;
		int numSides2 = 10;
		int coilX = 300;
		int coilY = 750;
		int maxRadius = 250;
		int numCoils = 20;
		int numSegmentsPerCoil = 10;
		int coilX1 = 750;
		int coilY1 = 300;
		int maxRadius1 = 125;
		int numCoils1 = 10;
		int numSegmentsPerCoil1 = 5;
		
		UnStdDraw.filledRegularPolygon(x, y, radius, numSides);
		UnStdDraw.spiral(coilX, coilY, maxRadius, numCoils, numSegmentsPerCoil);
		UnStdDraw.filledRegularPolygon(x1, y1, radius1, numSides1);
		UnStdDraw.spiral(coilX1, coilY1, maxRadius1, numCoils1, numSegmentsPerCoil1);
		UnStdDraw.filledRegularPolygon(x2, y2, radius2, numSides2);
		
		System.out.println("filledRegularPolygon() method invocations: " + UnStdDraw.getPolygonCounter());
		System.out.println("spiral() method invocations: " + UnStdDraw.getSpiralCounter());
		
		

	}

}
