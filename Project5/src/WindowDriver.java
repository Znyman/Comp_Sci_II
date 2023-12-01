/**Project 05
 * @author Zachery Nyman
 * 08 March 2017
 */

import edu.princeton.cs.introcs.StdDraw;

public class WindowDriver {

	public static void main(String[] args) {
		
		WindowDisplay w = new WindowDisplay(200, 200);
		Window w1 = new Window(50, 50, 60, 80, StdDraw.BLUE);
		w.addWindow(w1);
		Window w2 = new Window(100, 130, 80, 80, StdDraw.RED);
		w.addWindow(w2);
		Window w3 = new Window(50, 100, 60, 80, StdDraw.GREEN);
		w.addWindow(w3);
		Window w4 = new Window(120, 60, 100, 80, StdDraw.BLACK);
		w.addWindow(w4);
		w.run();
	}

}
