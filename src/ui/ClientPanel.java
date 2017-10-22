package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.PromptBean;

@SuppressWarnings("serial")
public class ClientPanel extends JPanel {
	
	private JFrame f;

	public ClientPanel(JFrame f, PromptBean pb) {
		this.setF(f);
		this.setLayout(new BorderLayout());
		//N : Chat
		
		//C : Chat Panel
		
		//E : Connected users
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}
}
