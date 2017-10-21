package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ClientPanel extends JPanel {
	
	private JFrame f;

	public ClientPanel(JFrame f) {
		this.setF(f);
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}
}
