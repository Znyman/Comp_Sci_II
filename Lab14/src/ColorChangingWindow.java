import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ColorChangingWindow extends JFrame {
	
	public static boolean color;
	public static final int WIDTH = 200;
	public static final int HEIGHT = 300;
	
	public ColorChangingWindow()
	{
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Color Changing Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//step 1: create the component (event source)
		JButton endButton = new JButton("Click to change color");
		//step 3: registering the listener with the component (event source)
		endButton.addActionListener(new EndingListener());//anonymous object
		//step 4: add button to the window
		//add(endButton);
		add(endButton, BorderLayout.SOUTH);
		getContentPane().setBackground(Color.BLUE);
	}
	//step 2: create  the event handler
	//inner class
	private class EndingListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(color)
			{
				color = false;
				getContentPane().setBackground(Color.RED);
			}
			else
			{
				color = true;
				getContentPane().setBackground(Color.GREEN);
			}
		}
	}

}
