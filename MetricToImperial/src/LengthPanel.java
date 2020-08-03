import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class LengthPanel extends JPanel {

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
		outputText.setEditable(false);
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
		convertButton.addActionListener(null);

	}
}
