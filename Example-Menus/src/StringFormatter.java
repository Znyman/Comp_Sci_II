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
import java.awt.Color;

public class StringFormatter extends JFrame {
	
	private JTextField inputField;
	private JTextField displayField;
	
	public StringFormatter()
	{
		super();
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Formatting Window");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu colorMenu = new JMenu("Color");
		JMenu alignmentMenu = new JMenu("Alignment");
		menuBar.add(colorMenu);
		menuBar.add(alignmentMenu);
		MenuItemListener lis = new MenuItemListener();
		JMenuItem black = new JMenuItem("Black");
		JMenuItem red = new JMenuItem("Red");
		JMenuItem blue = new JMenuItem("Blue");
		JMenuItem left = new JMenuItem("Left");
		JMenuItem right = new JMenuItem("Right");
		JMenuItem center = new JMenuItem("Center");
		black.addActionListener(lis);
		red.addActionListener(lis);
		blue.addActionListener(lis);
		left.addActionListener(lis);
		right.addActionListener(lis);
		center.addActionListener(lis);
		colorMenu.add(black);
		colorMenu.add(blue);
		colorMenu.add(red);
		alignmentMenu.add(left);
		alignmentMenu.add(right);
		alignmentMenu.add(center);
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Enter a string: "));
		inputField = new JTextField(20);
		inputPanel.add(inputField);
		add(inputPanel, BorderLayout.NORTH);
		
		displayField = new JTextField(20);
		add(displayField, BorderLayout.CENTER);
		displayField.setEditable(false);
	}
	
	private class MenuItemListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String command = e.getActionCommand();
			System.out.println(command);
			
			displayField.setText(inputField.getText());
			
			switch(command)
			{
			case "Black":
				displayField.setForeground(Color.BLACK);
				break;
			case "Red":
				displayField.setForeground(Color.RED);
				break;
			case "Blue":
				displayField.setForeground(Color.BLUE);
				break;
			case "Left":
				displayField.setHorizontalAlignment(JTextField.LEFT);
				break;
			case "Right":
				displayField.setHorizontalAlignment(JTextField.RIGHT);
				break;
			case "Center":
				displayField.setHorizontalAlignment(JTextField.CENTER);
				break;
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
