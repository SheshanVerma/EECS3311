package EECS3311_Project1;
//@author Sheshan Verma STD No. 217631441

//Singleton class which help function the sorting of the shapes

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sortButton extends JPanel implements ActionListener {
	private static sortButton sort;

	private sortButton() {

	}

	public static sortButton getInstance(JFrame frame, Panel panel) {
		if (sort == null) {
			sort = new sortButton(frame, panel);
		}
		return sort;
	}

	private JButton button2;
	private JFrame frame;
	private Panel panel;

	private sortButton(JFrame frame, Panel panel) {
		button2 = new JButton("SORT SHAPES");
		this.frame = frame;
		this.panel = panel;
		button2.addActionListener(this);
		frame.add(panel);
		button2.setBounds(400, 10, 125, 50);
		panel.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand() == "SORT SHAPES") {
			sortingTechnique.sort(panel);
		}

	}

}
