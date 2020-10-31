import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Controller implements ActionListener {
    private final ConverterFrame frame;
    private final DecimalFormat sciNot = new DecimalFormat("0.###E0");
    private final DecimalFormat normal = new DecimalFormat("#,##0.000");

    public Controller(ConverterFrame frame) {
        this.frame = frame;
    }

    public String numFormat(double val) {
        if (Math.abs(val) >= 1E9 || Math.abs(val) < 0.1) { // If the number is bigger than billion or smaller than a tenth = Sci. Notation
            return sciNot.format(val);
        }
        return normal.format(val);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double input = -1;
        String from = frame.getSelectedFromBox().toUpperCase();
        String to = frame.getSelectedToBox().toUpperCase();
        try {
            input = Double.parseDouble(frame.getSelectedPanelInput());
        } catch (NumberFormatException formatException) {
            JOptionPane.showMessageDialog(frame, "Can't convert words.", "Conversion Error", JOptionPane.ERROR_MESSAGE);
        }
        switch (frame.getSelectedPanelName().toUpperCase()) {
            case "LENGTH":
                from += "-L";
                to += "-L";
                break;
            case "MASS":
                from += "-M";
                to += "-M";
                break;
            case "VOLUME":
                from += "-V";
                to += "-V";
                break;
            case "TEMPERATURE":
                from += "-T";
                to += "-T";
                break;
        }
        frame.setSelectedPanelOutput(numFormat(Converter.convert(from, to, input)));
    }
}
