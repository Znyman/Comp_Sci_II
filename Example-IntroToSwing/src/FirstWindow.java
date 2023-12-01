import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.BorderLayout;

public class FirstWindow extends JFrame {
	
	public static final int WIDTH = 200;
	public static final int HEIGHT = 300;
	
	public FirstWindow()
	{
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("First Window Class");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//step 1: create the component (event source)
		JButton endButton = new JButton("Click to end program");
		//step 3: registering the listener with the component (event source)
		endButton.addActionListener(new EndingListener());//anonymous object
		//step 4: add button to the window
		//add(endButton);
		add(endButton, BorderLayout.SOUTH);
		getContentPane().setBackground(Color.RED);
		
	}
	//step 2: create  the event handler
	//inner class
	private class EndingListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("In EndingListener: actionPerformed method called.");//for instructional purposes
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
