package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LengthPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JComboBox<String> mBox;
	private JComboBox<String> imBox;
	private JTextField input;
	private JTextField output;
	private JButton convertButton;

	public LengthPanel() {
		String[] metric = { "Kilometre", "Metre", "Decimetre", "Centimetre", "Millimetre" };
		String[] imperial = { "Mile", "Yard", "Foot", "Inch" };

		mBox = new JComboBox<String>(metric);
		imBox = new JComboBox<String>(imperial);
		input = new JTextField(12);
		output = new JTextField(12);
		convertButton = new JButton("Convert");

		init();
	}

	private void init() {
		setLayout(new GridLayout(3, 2, 15, 7));
		setSize(468, 110);
		setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

		add(mBox);
		add(input);

		add(imBox);
		add(output);

		add(convertButton);

		mBox.addActionListener(this);
		imBox.addActionListener(this);

		convertButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mBox) {
			switch (mBox.getSelectedIndex()) {
			case 0: // Kilometre
				System.out.println("Kilometre");
				break;
			case 1: // Metre
				System.out.println("Metre");
				break;

			case 2: // Decimetre
				System.out.println("Decimetre");
				break;
			case 3: // Centimetre
				System.out.println("Centimetre");
				break;
			case 4: // Millimetre
				System.out.println("Millimetre");
				break;
			default:
				System.out.println("This should not be possible");
				break;
			}
		}
		if (e.getSource() == imBox) {
			switch (imBox.getSelectedIndex()) {
			case 0: // Mile
				System.out.println("Mile");
				break;
			case 1: // Yard
				System.out.println("Yard");
				break;
			case 2: // Foot
				System.out.println("Foot");
				break;
			case 3: // Inch
				System.out.println("Inch");
				break;
			default:
				System.out.println("This should not be possible");
				break;
			}
		}
	}
}
