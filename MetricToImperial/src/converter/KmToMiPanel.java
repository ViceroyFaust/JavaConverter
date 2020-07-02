package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KmToMiPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JComboBox<String> mBox;
	private JComboBox<String> imBox;
	private JTextField input;
	private JTextField output;
	private JButton convertButton;

	public KmToMiPanel() {
		String[] metric = {"Kilometre", "Metre", "Decimetre", "Centimetre", "Millimetre"};
		String[] imperial = {"Mile", "Yard", "Foot", "Inch"};

		mBox = new JComboBox<String>(metric);
		imBox = new JComboBox<String>(imperial);
		input = new JTextField(12);
		output = new JTextField(12);
		convertButton = new JButton("Convert");
		
		init();
	}

	private void init() {
		setLayout(new GridLayout(3, 2, 15, 0));
		setSize(468, 110);
		setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
		
		add(mBox);
		add(input);
		
		add(imBox);
		add(output);
		add(convertButton);
		
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
