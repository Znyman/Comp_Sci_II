import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FlowLayoutWindow extends JFrame {
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	
	public FlowLayoutWindow()
	{
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Flow Layout Window");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel label1 = new JLabel("Label 1's text");
		label1.setForeground(Color.RED);
		add(label1);
		JButton endButton = new JButton("Click to close window");
		endButton.setBackground(Color.BLUE);
		endButton.setOpaque(true);
		endButton.addActionListener(new EndingListener());
		add(endButton);
		JLabel label2 = new JLabel("Hello, World!");
		label2.setForeground(Color.GREEN);
		add(label2);
		JLabel label3 = new JLabel("Label 3");
		label3.setForeground(Color.YELLOW);
		add(label3);
	}
	
	private class EndingListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	

}
