/**Project1
 * @author Zachery Nyman
 * 12 January 2016
 */

public class EnvironmentDriver {

	public static void main(String[] args) {
		
		String filename = "GameOfLife4.txt";
		Environment environment = new Environment(filename);
		
		while (true)
		{
			environment.runSimulation();
			environment.draw();
		}
	}
}
