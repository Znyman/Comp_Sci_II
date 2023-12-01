import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class BorderLayoutWindow extends JFrame {
	
	public BorderLayoutWindow()
	{
		super();
		setSize(300,200);
		setTitle("Border Layout Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());//optional: BorderLayout is default for JFrame
		JLabel center = new JLabel("This is the center Label", JLabel.CENTER);
		center.setOpaque(true);
		center.setBackground(Color.RED);
		add(center, BorderLayout.CENTER);
		
		JLabel east = new JLabel("This is the eastern Label", JLabel.CENTER);
		east.setOpaque(true);
		east.setBackground(Color.BLUE);
		add(east, BorderLayout.EAST);
		
		JLabel south = new JLabel("This is the south Label", JLabel.RIGHT);
		south.setOpaque(true);
		south.setBackground(Color.GREEN);
		add(south, BorderLayout.SOUTH);
		
		JPanel buttonPanel = new JPanel();
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		buttonPanel.setBackground(Color.YELLOW);
		buttonPanel.add(ok);
		buttonPanel.add(cancel);
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
}
