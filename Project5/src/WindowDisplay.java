/**Project 05
 * @author Zachery Nyman
 * 08 March 2017
 */

import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;

public class WindowDisplay {
	
	private ArrayList<Window> windowList;
	private int width, height;
	
	public WindowDisplay(int initialWidth, int initialHeight)
	{
		width = initialWidth;
		height = initialHeight;
		windowList = new ArrayList<Window>();
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
	}
	
	public void addWindow(Window initialWindow)
	{
		windowList.add(initialWindow);
	}
	
	public void run()
	{
		while(true)
		{
			StdDraw.clear();
			for(int i = 0; i < windowList.size(); i++)
			{
				windowList.get(i).draw();
				if(StdDraw.mousePressed() && windowList.get(i).containsPoint(StdDraw.mouseX(), StdDraw.mouseY()))
				{
					windowList.add(windowList.get(i));
					windowList.remove(i);
				}
			}
			StdDraw.show(0);
		}
	}
}
