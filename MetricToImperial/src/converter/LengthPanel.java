package converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	public LengthPanel() {
		String[] metric = { "Kilometre", "Metre", "Decimetre", "Centimetre", "Millimetre" };
		String[] imperial = { "Mile", "Yard", "Foot", "Inch" };

		mBox = new JComboBox<String>(metric);
		imBox = new JComboBox<String>(imperial);
		mTxt = new JTextField(12);
		imTxt = new JTextField(12);
		convertButton = new JButton("Convert");

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
			
			break;
		case 1: // m
			
			break;
		case 2: // dm
			
			break;
		case 3: // cm
			
			break;
		case 4: // mm
			
			break;
		default:
			System.out.println("This should not be possible");
			break;
		}
	}
}
