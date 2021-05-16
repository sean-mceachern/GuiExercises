import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


// This displays two gradient colored circles side by side and a button below, when the userAction is taken (button is clicked)
// the circles change colors. The button has the addActionListen() to be ready for user action to be taken



public class SimpleGui3C implements ActionListener {
	JFrame frame;

	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Change Colors. WOW!"); /* add text to button */
		button.addActionListener(this); /* listen for action on this simple GUI */

		MyDrawPanel drawPanel = new MyDrawPanel(); /* call to MyDrawPanel class from previous example, builds the shape */

		frame.getContentPane().add(BorderLayout.SOUTH, button); /* put the button on the bottom */
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel); /* put the shape in the center position */
		frame.setSize(500,300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		frame.repaint(); /* calls paintComponent() on every widget when the user performs a click */
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