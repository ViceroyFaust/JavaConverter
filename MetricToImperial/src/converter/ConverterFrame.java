package converter;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class ConverterFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public ConverterFrame() {
		init();
	}

	private void init() {
		setName("Metric to Imperial");
		setSize(400, 200);
		setLayout(new GridLayout(0, 3));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}
}
