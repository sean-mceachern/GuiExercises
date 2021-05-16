import java.awt.*;
import javax.swing.*;


// adding buttons to the panel then adding the panel to the frame. Boxlayout vs. flowlayout(default)


public class Panel1 {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.darkGray); /* make the panel gray so we can see it on the frame */

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  /* Y_AXIS = vertical stack */
		// panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); /* X_AXIS = horizontal stack */

		JButton button = new JButton("Shockuh Bruh");
		JButton button2 = new JButton("bless");

		// add the button to the panel and add the panel to the frame
		panel.add(button);
		panel.add(button2);
		frame.getContentPane().add(BorderLayout.EAST, panel);

		frame.setSize(250,200);
		frame.setVisible(true);
	}
}














