package EECS3311_Project1;
//@author Sheshan Verma STD No. 217631441
//Singleton class which help button to load the shapes on the interface

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import EECS3311.loadbutton;

public class loadButton extends JPanel implements ActionListener {
	private static loadButton load;

	private loadButton() {

	}

	public static loadButton getInstance(JFrame frame, Panel panel) {
		if (load == null) {
			load = new loadButton(frame, panel);
		}
		return load;
	}
	private JButton button1;
	private JFrame frame;
	private Panel panel;
	private loadButton(JFrame frame, Panel panel) {
		button1 = new JButton("LOAD SHAPES");
		this.frame = frame;
		this.panel = panel;
		button1.addActionListener(this);
		frame.add(panel);
		button1.setBounds(400, 10, 125, 50);
		panel.add(button1);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand() == "LOAD SHAPES") {
			ShapeFactory.getInstance().generateShape(panel);
		}
		
	}

}
