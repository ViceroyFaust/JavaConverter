package gui;

import javax.swing.*;

public class ConverterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private LengthPanel lengthPanel;
	private JTabbedPane tabs;
	
	public ConverterFrame() {
		lengthPanel = new LengthPanel();
		tabs = new JTabbedPane();
		
		init();
	}

	private void init() {
		setTitle("Converter");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(tabs);
		tabs.addTab("Length", lengthPanel);
		
		pack();
		setVisible(true);
	}
}
