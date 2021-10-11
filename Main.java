package EECS3311_Project1;
//@author Sheshan Verma STD No. 217631441

import java.awt.Graphics;
import java.awt.List;

//Singleton class to distingues between mypanel class and main class

import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

	private static Main mainclass;

	private Main() {
	}

	public static Main getInstance() {
		if (mainclass == null) {
			mainclass = new Main();
		}
		return mainclass;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Display Shapes");
		Panel panel = new Panel();
		loadButton.getInstance(frame, panel);
		sortButton.getInstance(frame, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}