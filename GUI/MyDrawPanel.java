import java.awt.*;
import javax.swing.*;
// this class will be used by simpleGui3C class

// Using the Graphics API to draw. Exploring how to add rectangle, text, random colors, circle, gradient color

class MyDrawPanel extends JPanel { /* extends Panel API so that i can use it */
	// public static void main(String[] args) {
	// JFrame frame = new JFrame("Drawing is fun"); /*set title of the GUI */
	// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  required to kill program when window is closed 
	// MyDrawPanel p = new MyDrawPanel(); /* create the drawing */
	// frame.add(p);
	// frame.setSize(500,500); /*GUI display size*/
	// frame.setVisible(true); /* we want to see the GUI */
	// }

	public void paintComponent(Graphics g) { /*Graphics g is going to be the drawing board*/
		// ** simple rectangle
		// g.setColor(Color.orange);
		// g.fillRect(20,50,100,100);

	
		// ** simple text
		// g.setColor(Color.RED);
		// g.drawString("this is a text",100,100);
		
	
		// ** insert JPEG
		// Image image = new ImageIcon("<filename>.jpeg")
		// g.drawImage(image,3,4,this); /* x,y coordinates mean x=3 pixels from the left edge and y=4 pixels from the top edge */
	

		// ** randomly colored circle on black background
		// g.setColor(Color.BLACK);
		// g.fillRect(0,0,this.getWidth(),this.getHeight()); /* start drawing @: x=0 pixels from the left, y=0 pixels from the top. and draw to the width and height of the GUI */
		// // making the colors random
		// int red = (int) (Math.random() * 256);
		// int green = (int) (Math.random() * 256);
		// int blue = (int) (Math.random() * 256);
		// // assign colors to a new color object instance, mixes the RGB together
		// Color randomColor = new Color(red,green,blue);
		// g.setColor(randomColor);
		// g.fillOval(70,70,100,100); /* start at 70 pixels from the left, 70 from the top, draw it 100 pixels wide and 100 tall */


		
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
		GradientPaint gp2 = new GradientPaint(startX + 200,startY, startColor, endX + 200,endY, endColor);
		g2d.setPaint(gp2);
		g2d.fillOval(startX + 200,startY,endX,endY);
	}
}
































