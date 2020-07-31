package converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class LengthPanel extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private double previousNum;
    private double previousIndex;
    private LengthConverter converter;

    private JComboBox<String> inputBox;
    private JComboBox<String> outputBox;
    private JTextField inputText;
    private JTextField outputText;
    private JButton convertButton;

    private DecimalFormat standardFormat;
    private DecimalFormat scienceFormat;

    public LengthPanel() {
        String[] choices = {"---METRIC---", "Kilometres", "Metres", "Decimetres", "Centimetres", "Millimetres", "---IMPERIAL---", "Miles", "Yards", "Feet", "Inches"};
        previousNum = 0;
        previousIndex = 1;

        inputBox = new JComboBox<>(choices);
        outputBox = new JComboBox<>(choices);
        inputText = new JTextField(12);
        outputText = new JTextField(12);
        outputText.setEditable(false);
        convertButton = new JButton("Convert");
        convertButton.setMnemonic(KeyEvent.VK_C);

        standardFormat = new DecimalFormat("#,##0.000");
        scienceFormat = new DecimalFormat("0.0##E0");

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

        double input = Double.parseDouble(inputText.getText());
        if (input != previousNum || inputBox.getSelectedIndex() != previousIndex) {
            switch (inputBox.getSelectedIndex()) {
                case 1: // Kilometres
                    converter = new LengthConverter(LengthConverter.Length.KILOMETRE, input);
                    break;
                case 2: // Metres
                    converter = new LengthConverter(LengthConverter.Length.METRE, input);
                    break;
                case 3: // Decimetres
                    converter = new LengthConverter(LengthConverter.Length.DECIMETRE, input);
                    break;
                case 4: // Centimetres
                    converter = new LengthConverter(LengthConverter.Length.CENTIMETRE, input);
                    break;
                case 5: // Millimetres
                    converter = new LengthConverter(LengthConverter.Length.MILLIMETRE, input);
                    break;
                case 7: // Miles
                    converter = new LengthConverter(LengthConverter.Length.MILE, input);
                    break;
                case 8: // Yards
                    converter = new LengthConverter(LengthConverter.Length.YARD, input);
                    break;
                case 9: // Feet
                    converter = new LengthConverter(LengthConverter.Length.FOOT, input);
                    break;
                case 10: // Inches
                    converter = new LengthConverter(LengthConverter.Length.INCH, input);
                    break;
                default:
                    // Should not be possible to get this result
            }
        }
        previousNum = input;
        previousIndex = inputBox.getSelectedIndex();

        double convertedLength;
        switch (outputBox.getSelectedIndex()) {
            case 1: // Kilometres
                convertedLength = converter.convert(LengthConverter.Length.KILOMETRE);
                break;
            case 2: // Metres
                convertedLength = converter.convert(LengthConverter.Length.METRE);
                break;
            case 3: // Decimetres
                convertedLength = converter.convert(LengthConverter.Length.DECIMETRE);
                break;
            case 4: // Centimetres
                convertedLength = converter.convert(LengthConverter.Length.CENTIMETRE);
                break;
            case 5: // Millimetres
                convertedLength = converter.convert(LengthConverter.Length.MILLIMETRE);
                break;
            case 7: // Miles
                convertedLength = converter.convert(LengthConverter.Length.MILE);
                break;
            case 8: // Yards
                convertedLength = converter.convert(LengthConverter.Length.YARD);
                break;
            case 9: // Feet
                convertedLength = converter.convert(LengthConverter.Length.FOOT);
                break;
            case 10: // Inches
                convertedLength = converter.convert(LengthConverter.Length.INCH);
                break;
            default:
                convertedLength = 0; // Should not be possible to get this result
        }

        if (convertedLength >= 1000000000 || convertedLength < .1) {
            outputText.setText(scienceFormat.format(convertedLength));
        } else {
			outputText.setText(standardFormat.format(convertedLength));
		}
    }
}
