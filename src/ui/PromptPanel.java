package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PromptPanel extends JPanel {

	private JFrame f;
	private JTextField portField = new JTextField(), nicknameField = new JTextField();
	private JLabel portLabel = new JLabel("Port : "), nicknameLabel = new JLabel("Pseudo : ");
	private JButton button = new JButton("Go");
	private JPanel offsetPanelE = new JPanel(), offsetPanelW = new JPanel(), offsetPanelN = new JPanel(), offsetPanelS = new JPanel();

	public PromptPanel(JFrame f) {
		this.setF(f);
		this.setLayout(new BorderLayout());
		
		//EW offset : 25% 25%
		this.add(offsetPanelE, BorderLayout.EAST);
		this.add(offsetPanelW, BorderLayout.WEST);
		
		//C Grid 0 2
		JPanel textFieldWrapper1 = new JPanel(); JPanel textFieldWrapper2 = new JPanel();
		JPanel labelWrapper1 = new JPanel(); JPanel labelWrapper2 = new JPanel();
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(0, 2));
		jp.add(offsetPanelN);
		jp.add(new JPanel());
		textFieldWrapper1.setLayout(new GridBagLayout());textFieldWrapper2.setLayout(new GridBagLayout());
		labelWrapper1.setLayout(new GridBagLayout());labelWrapper2.setLayout(new GridBagLayout());
		textFieldWrapper1.add(nicknameField);textFieldWrapper2.add(portField);
		labelWrapper1.add(nicknameLabel);labelWrapper2.add(portLabel);
		jp.add(labelWrapper1); jp.add(textFieldWrapper1);
		jp.add(labelWrapper2); jp.add(textFieldWrapper2);
		jp.add(offsetPanelS);
		portField.setPreferredSize(new Dimension(120, 30));
		nicknameField.setPreferredSize(new Dimension(120, 30));
		this.add(jp, BorderLayout.CENTER);
		
		//S bouton Go
		JPanel jp2 = new JPanel();
		jp2.add(button);
		this.add(jp2, BorderLayout.SOUTH);
		
		//N Label "Chat"
		JPanel jpLogo = new JPanel();
		this.add(jpLogo, BorderLayout.NORTH);
	}
	
	@Override
	public void repaint() {
		super.repaint();
		if(offsetPanelE!=null && offsetPanelW!=null && offsetPanelN!=null && offsetPanelS!=null) {
			offsetPanelE.setPreferredSize(new Dimension(f.getWidth()/3, f.getHeight()));
			offsetPanelW.setPreferredSize(new Dimension(f.getWidth()/4, f.getHeight()));
			offsetPanelN.setPreferredSize(new Dimension(f.getWidth()/6, f.getHeight()));
			offsetPanelS.setPreferredSize(new Dimension(f.getWidth()/6, f.getHeight()));
		}
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public JTextField getPortField() {
		return portField;
	}

	public void setPortField(JTextField portField) {
		this.portField = portField;
	}

	public JTextField getNicknameField() {
		return nicknameField;
	}

	public void setNicknameField(JTextField nicknameField) {
		this.nicknameField = nicknameField;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
}
