package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LengthPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JComboBox<String> inputBox;
	private JComboBox<String> outputBox;
	private JTextField inputText;
	private JTextField outputText;
	private JButton convertButton;

	private DecimalFormat standardFormat;
	private DecimalFormat scienceFormat;

	private Converter converter;

	public LengthPanel() {
		String[] choices = { "---METRIC---", "Kilometres", "Metres", "Decimetres", "Centimetres", "Millimetres", "---IMPERIAL---", "Miles", "Yards", "Feet", "Inches" };

		inputBox = new JComboBox<String>(choices);
		outputBox = new JComboBox<String>(choices);
		inputText = new JTextField(12);
		outputText = new JTextField(12);
		convertButton = new JButton("Convert");
		convertButton.setMnemonic(KeyEvent.VK_C);

		standardFormat = new DecimalFormat("#,##0.000");
		scienceFormat = new DecimalFormat("0.0##E0");

		converter = new Converter();

		init();
	}

	private void init() {
		setLayout(new GridLayout(3, 2, 15, 7));
		setSize(468, 110);
		setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

		inputBox.setSelectedIndex(1); // Start with metres
		outputBox.setSelectedIndex(2); // Start with feet

		add(inputBox);
		add(inputText);

		add(outputBox);
		add(outputText);

		add(convertButton);
		convertButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (inputBox.getSelectedIndex()) {
		case 1: // Km
			converter.setFromFactor(Length.KILOMETRES);
			break;
		case 2: // m
			converter.setFromFactor(Length.METRES);
			break;
		case 3: // dm
			converter.setFromFactor(Length.DECIMETRES);
			break;
		case 4: // cm
			converter.setFromFactor(Length.CENTIMETRES);
			break;
		case 5: // mm
			converter.setFromFactor(Length.MILLIMETRES);
			break;
		case 7: // Mi
			converter.setFromFactor(Length.MILES);
			break;
		case 8: // Yd
			converter.setFromFactor(Length.YARDS);
			break;
		case 9: // Ft
			converter.setFromFactor(Length.FEET);
			break;
		case 10: // In
			converter.setFromFactor(Length.INCHES);
			break;
		default:
			System.out.println("This should not be possible");
		}

		switch (outputBox.getSelectedIndex()) {
		case 1: // Km
			converter.setToFactor(Length.KILOMETRES);
			break;
		case 2: // m
			converter.setToFactor(Length.METRES);
			break;
		case 3: // dm
			converter.setToFactor(Length.DECIMETRES);
			break;
		case 4: // cm
			converter.setToFactor(Length.CENTIMETRES);
			break;
		case 5: // mm
			converter.setToFactor(Length.MILLIMETRES);
			break;
		case 7: // Mi
			converter.setToFactor(Length.MILES);
			break;
		case 8: // Yd
			converter.setToFactor(Length.YARDS);
			break;
		case 9: // Ft
			converter.setToFactor(Length.FEET);
			break;
		case 10: // In
			converter.setToFactor(Length.INCHES);
			break;
		default:
			System.out.println("This should not be possible");
		}

		double convertedLength = converter.convert(Double.parseDouble(inputText.getText()));
		if (convertedLength >= 1000000000 || convertedLength < .001) {
			outputText.setText(scienceFormat.format(convertedLength));
		} else {
			outputText.setText(standardFormat.format(convertedLength));
		}
	}
}
