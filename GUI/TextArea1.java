import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// JTextArea Example:
// Builds a text panel and a button. each time the button is clicked, add text to the panel. also, add a verticle scroll bar for the panel

public class TextArea1 implements ActionListener {
	JTextArea text;

	public static void main(String[] args) {
		TextArea1 gui = new TextArea1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Push it good");
		button.addActionListener(this);
		text = new JTextArea(10,20); /* JTextArea(lines height, columns width) */
		text.setLineWrap(true); /* set linewrap for the text area */

		JScrollPane scroller = new JScrollPane(text); /*put a scroll on the text area (10x20) */
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); /* turn verticle scroll bar on */
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); /* turn horizontal scroll bar off */

		panel.add(scroller); /* IMPORTANT: must add the text area to the scroll pane first, then add scroller to the pane! */

		frame.getContentPane().add(BorderLayout.CENTER, panel); /* add text area panel to the center */
		frame.getContentPane().add(BorderLayout.SOUTH, button); /* add button to the south */

		frame.setSize(350,300);
		frame.setVisible(true);
	}
	// ** adds text to field each time the button is clicked
	public void actionPerformed(ActionEvent ev) {
		text.append("Salt n Peppas here \n"); 
	}
}






















