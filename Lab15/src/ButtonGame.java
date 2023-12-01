/**
 * Lab15
 * @author Zachery Nyman
 * 02 March 2017
 */

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ButtonGame extends JFrame {
	
	public static final int ROWS = 4;
	public static final int COLS = 6;
	Random randomNumber = new Random();
	private static int winningButton;
	
	public ButtonGame()
	{
		super();
		setSize(600, 400);
		setTitle("Button Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(ROWS, COLS));
		MyButtonListener buttonListener = new MyButtonListener();
		winningButton = randomNumber.nextInt(24)+1;
		for(int i = 1; i <= ROWS * COLS; i++)
		{
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.addActionListener(buttonListener);
			add(b);
		}
	}
	private class MyButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(Integer.toString(winningButton).equals(e.getActionCommand()) || e.getActionCommand().equals("Won"))
			{
				JButton b = (JButton)e.getSource();
				b.setText("Won");
			}
			else
			{
				JButton b = (JButton)e.getSource();
				b.setText("No");
			}
		}
	}
}
