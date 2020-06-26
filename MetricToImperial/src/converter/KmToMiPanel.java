package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KmToMiPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JTextField input;
	private JTextField output;
	private JButton convertButton;

	public KmToMiPanel() {
		input = new JTextField(20);
		output = new JTextField(20);
		convertButton = new JButton("Convert");
		
		init();
	}

	private void init() {
		setLayout(new GridLayout(1, 3));
		add(input);
		add(output);
		add(convertButton);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
