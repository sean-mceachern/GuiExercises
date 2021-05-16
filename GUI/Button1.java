import javax.swing.*;
import java.awt.*; /* borderLayout is in this package */

public class Button1 {
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JButton button = new JButton("click me");
		// JButton button = new JButton("click me like you mean it chump"); /* to test longer text */
		// JButton button = new JButton("There is no...spoon...");
		JButton east = new JButton("East"); 
		JButton west = new JButton("West"); 
		JButton north = new JButton("North"); 
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		// Font bigFont = new Font("serif", Font.BOLD, 46);  customize the font to make it bigger to see the affects 
		// button.setFont(bigFont);

		// frame.getContentPane().add(BorderLayout.EAST, button); /* add button to the East border */
		// frame.getContentPane().add(BorderLayout.NORTH, button); /* lets see how it differs in the north region */
		frame.getContentPane().add(BorderLayout.EAST, east); 
		frame.getContentPane().add(BorderLayout.WEST, west); 
		frame.getContentPane().add(BorderLayout.NORTH, north); 
		frame.getContentPane().add(BorderLayout.SOUTH, south); 
		frame.getContentPane().add(BorderLayout.CENTER, center);

		frame.setSize(200,200);
		frame.setVisible(true);
	}
}