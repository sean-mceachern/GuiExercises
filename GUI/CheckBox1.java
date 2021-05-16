import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class CheckBox1 implements ItemListener{
	JCheckBox check;
	
	public static void main(String[] args) {
		CheckBox1 gui = new CheckBox1();
		gui.go();
	}

	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		check = new JCheckBox("Goes to 11");
		check.addItemListener(this);

		frame.getContentPane().add(BorderLayout.EAST, check);

		frame.setSize(350,300);
		frame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent ev) {
		String onOrOff = "off";
		if(check.isSelected()) {
			onOrOff = "on";
			System.out.println("Check box is " + onOrOff);
		}
	}
}

