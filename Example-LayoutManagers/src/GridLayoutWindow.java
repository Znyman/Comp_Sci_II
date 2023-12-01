import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GridLayoutWindow extends JFrame {
	
	public static final int ROWS = 3;
	public static final int COLS = 3;
	
	public GridLayoutWindow()
	{
		super();
		setSize(200,200);
		setTitle("Border Layout Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(ROWS, COLS));
		MyButtonListener buttonListener = new MyButtonListener();
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
			System.out.println(e.getActionCommand());
		}
	}
	
}
