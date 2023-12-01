/** Lab16
 * @author Zachery Nyman
 * 07 March 2017
 */

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.text.DecimalFormat;

public class SimpleMathWindow extends JFrame {
	
	private JTextField inputField;
	
	public SimpleMathWindow()
	{
		super();
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Simple Math Window");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu arithMenu = new JMenu("Arithmetic");
		menuBar.add(arithMenu);
		MenuItemListener lis = new MenuItemListener();
		JMenuItem square = new JMenuItem("Squared");
		JMenuItem cube = new JMenuItem("Cubed");
		JMenuItem absoluteVal = new JMenuItem("Absolute Value");
		square.addActionListener(lis);
		cube.addActionListener(lis);
		absoluteVal.addActionListener(lis);
		arithMenu.add(square);
		arithMenu.add(cube);
		arithMenu.add(absoluteVal);
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Enter a number: "));
		inputField = new JTextField(10);
		inputPanel.add(inputField);
		add(inputPanel, BorderLayout.NORTH);
	}
	
	private class MenuItemListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String command = e.getActionCommand();
			System.out.println(command);
			DecimalFormat myFormatter = new DecimalFormat("0.000");
			
			try
			{
				double number = Double.parseDouble(inputField.getText());
				
				switch(command)
				{
				case "Squared":
					number *= number;
					inputField.setText(myFormatter.format(number));
					break;
				case "Cubed":
					number = number * number * number;
					inputField.setText(myFormatter.format(number));
					break;
				case "Absolute Value":
					inputField.setText(myFormatter.format(Math.abs(number)));
					break;
				}
			}
			catch(NumberFormatException ex)
			{
				inputField.setText("?");
			}
		}
	}
}
