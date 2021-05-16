import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

// Similar to Text area, except a list that is added is arranged as a list in text. if an item in the list is
// double clicked then the item name is printed in the terminal.


public class List1 implements ListSelectionListener{
	String[] listEntries = {"alpha","beta","gamma","delta","epsilon","zeta","eta","theta"};
	JList list = new JList(listEntries);

	public static void main(String[] args) {
		List1 gui = new List1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		Just like in the TextArea1 we add the text to the scroller then the scroller to the pane
		JScrollPane scroller = new JScrollPane(list); /* add the list to the text area */
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller); /* add the scroller (with text added) to the panel */

		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// list.addListSelectionListener(this);
		frame.getContentPane().add(BorderLayout.CENTER, panel); /* add the panel (with scroller/text) to the frame */

		/* display the frame */
		frame.setSize(350,300);
		frame.setVisible(true);
	}

	public void valueChanged(ListSelectionEvent lse) {
		if(!lse.getValueIsAdjusting()) {
			String selection = (String) list.getSelectedValue();
			System.out.println(selection);
		}
	}
}