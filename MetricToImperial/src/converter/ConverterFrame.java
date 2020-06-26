package converter;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class ConverterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private KmToMiPanel kmToMi;
	
	public ConverterFrame() {
		kmToMi = new KmToMiPanel();
		
		init();
	}

	private void init() {
		setTitle("Metric to Imperial");
		setLayout(new GridLayout(0, 1, 20, 0));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(kmToMi);
		
		pack();
		setVisible(true);
	}
}
