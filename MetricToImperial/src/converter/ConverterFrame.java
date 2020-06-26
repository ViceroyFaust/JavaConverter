package converter;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ConverterFrame extends JFrame {

	public ConverterFrame() {
		init();
	}

	private void init() {
		setName("Metric to Imperial");
		setSize(400, 200);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}
}
