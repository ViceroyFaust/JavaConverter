package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LengthPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JComboBox<String> mBox;
	private JComboBox<String> imBox;
	private JTextField mTxt;
	private JTextField imTxt;
	private JButton convertButton;
	
	private DecimalFormat format;
	private Converter converter;

	public LengthPanel() {
		String[] metric = { "Kilometre", "Metre", "Decimetre", "Centimetre", "Millimetre" };
		String[] imperial = { "Mile", "Yard", "Foot", "Inch" };

		mBox = new JComboBox<String>(metric);
		imBox = new JComboBox<String>(imperial);
		mTxt = new JTextField(12);
		imTxt = new JTextField(12);
		convertButton = new JButton("Convert");
		
		format = new DecimalFormat("#,##0.###");
		converter = new Converter();

		init();
	}

	private void init() {
		setLayout(new GridLayout(3, 2, 15, 7));
		setSize(468, 110);
		setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
		
		mBox.setSelectedIndex(1); // Start with metres
		imBox.setSelectedIndex(2); // Start with feet

		add(mBox);
		add(mTxt);

		add(imBox);
		add(imTxt);

		add(convertButton);
		convertButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (mBox.getSelectedIndex()) {
		case 0: // Km
			converter.setFromFactor(Length.KILOMETRES);
			break;
		case 1: // m
			converter.setFromFactor(Length.METRES);
			break;
		case 2: // dm
			converter.setFromFactor(Length.DECIMETRES);
			break;
		case 3: // cm
			converter.setFromFactor(Length.CENTIMETRES);
			break;
		case 4: // mm
			converter.setFromFactor(Length.MILLIMETRES);
			break;
		default:
			System.out.println("This should not be possible");
			break;
		}
		
		switch (imBox.getSelectedIndex()) {
		case 0: // Mi
			converter.setToFactor(Length.MILES);
			break;
		case 1: // Yd
			converter.setToFactor(Length.YARDS);
			break;
		case 2: // Ft
			converter.setToFactor(Length.FEET);
			break;
		case 3: // In
			converter.setToFactor(Length.INCHES);
			break;
		default:
			System.out.println("This should not be possible");
			break;
		}
		
		imTxt.setText(format.format(converter.convert(Double.parseDouble(mTxt.getText()))));
	}
}
