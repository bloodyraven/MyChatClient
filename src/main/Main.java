package main;

import java.awt.Dimension;

import javax.swing.JFrame;

import ui.PromptPanel;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Chat Client");
		f.setSize(new Dimension(700, 450));
		f.setContentPane(new PromptPanel(f));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
