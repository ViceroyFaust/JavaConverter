package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KmToMiPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel kilometres;
	private JLabel miles;
	private JTextField input;
	private JTextField output;
	private JButton convertButton;

	public KmToMiPanel() {
		input = new JTextField(12);
		output = new JTextField(12);
		convertButton = new JButton("Convert");
		kilometres = new JLabel("Kilometres:");
		miles = new JLabel("Miles:");
		
		init();
	}

	private void init() {
		setLayout(new GridLayout(2, 3, 15, 0));
		setSize(468, 110);
		setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
		
		add(kilometres);
		add(Box.createGlue());
		add(miles);
		
		add(input);
		add(convertButton);
		add(output);
		
		convertButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat format = new DecimalFormat("#,##0.###");
		double km = Double.parseDouble(input.getText());
		double mi = km / 1.609344;
		output.setText(format.format(mi));
	}
}
