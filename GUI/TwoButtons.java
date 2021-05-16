import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// purpose: understanding how to use inner classes to best use the instance variables of TwoButtons class.
// Added two buttons with different functionability. the first changes the color of an object. the second changes text on a button.

public class TwoButtons {
	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add button to change label
		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelListener());
		// add button to change color
		JButton colorButton = new JButton("Change Color");
		colorButton.addActionListener(new ColorListener());
		label = new JLabel("Im A Label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		// assign locations to display objects
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);

		frame.setSize(500,500);
		frame.setVisible(true);
	}

	// first inner class for label
	class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			// change back an forth between new labels
			if(label.getText() == "Im A Label"){
				label.setText("ScallyWag!"); /* can use label since we are inside TwoButtons class */
			} else {
				label.setText("Im A Label");
			}
		}
	}
	//second inner class to change the color of object draw panel
	class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			frame.repaint(); /* again, can use label since it is inner class */	
		}	
	}
}

class MyDrawPanel extends JPanel { /* extends Panel API so that i can use it */

	public void paintComponent(Graphics g) { /*Graphics g is going to be the drawing board*/
		// ** gradient circle: to use the gradiant method we need to type cast g into a Graphics2D (subclass of Object)
		Graphics2D g2d = (Graphics2D) g;
		// randomize colors for start and end gradient colors
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, green, blue);
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, green, blue);

		int startX = 70;
		int startY = 70;
		int endX = 150;
		int endY = 150;
		// GradientPaint(startingPointX, startingPointY, startingColor, endingPointX, endingPointY, endingColor)
		GradientPaint gp = new GradientPaint(startX,startY, startColor, endX,endY, endColor);
		g2d.setPaint(gp);
		g2d.fillOval(startX,startY,endX,endY); /* fill the oval with the setPaint input */
		// add second shape
		// GradientPaint gp2 = new GradientPaint(startX + 200,startY, startColor, endX + 200,endY, endColor);
		// g2d.setPaint(gp2);
		// g2d.fillOval(startX + 200,startY,endX,endY);
	}
}
























