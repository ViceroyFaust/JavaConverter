package converter;

import javax.swing.*;

public class ConverterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private LengthPanel kmToMi;
	private JTabbedPane tabs;
	
	public ConverterFrame() {
		kmToMi = new LengthPanel();
		tabs = new JTabbedPane();
		
		init();
	}

	private void init() {
		setTitle("Converter");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(tabs);
		tabs.addTab("Length", kmToMi);
		
		pack();
		setVisible(true);
	}
}
