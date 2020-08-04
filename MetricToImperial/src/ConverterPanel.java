import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ConverterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final JComboBox<String> inputBox;
	private final JComboBox<String> outputBox;
	private final JTextField inputText;
	private final JTextField outputText;
	private final JButton convertButton;

	private final ActionListener listener;

	public ConverterPanel(String[] choices, ActionListener listener) {
		inputBox = new JComboBox<>(choices);
		outputBox = new JComboBox<>(choices);
		inputText = new JTextField(12);
		outputText = new JTextField(12);
		outputText.setEditable(false);
		convertButton = new JButton("Convert");
		convertButton.setMnemonic(KeyEvent.VK_C);
		this.listener = listener;

		init();
	}

	private void init() {
		setLayout(new GridLayout(3, 2, 15, 7));
		setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

		add(inputBox);
		add(inputText);

		add(outputBox);
		add(outputText);

		add(convertButton);
		convertButton.addActionListener(listener);

	}

	public String getInput() {
		return inputText.getText();
	}

	public String getFromSelection() {
		return (String) inputBox.getSelectedItem();
	}

	public String getToSelection() {
		return (String) outputBox.getSelectedItem();
	}

	public void setOutput(String output) {
		outputText.setText(output);
	}
}
