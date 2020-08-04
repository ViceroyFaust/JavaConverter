import javax.swing.*;

public class ConverterFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private final Controller control;
    private final ConverterPanel lengthPanel;
    private final ConverterPanel massPanel;
    private final ConverterPanel volumePanel;
    private final ConverterPanel temperaturePanel;
    private final JTabbedPane tabs;

    public ConverterFrame() {
        String[] lengths = {"Please Select", "---METRIC---", "Kilometres", "Metres", "Decimetres", "Centimetres",
				"Millimetres", "---IMPERIAL---", "Miles", "Yards", "Feet", "Inches"};
        String[] masses = {"Please Select", "---METRIC---", "Tonnes", "Kilogrammes", "Grammes", "Milligrammes",
				"---IMPERIAL---", "Tons", "Pounds", "Ounces"};
        String[] volumes = {"Please Select", "---METRIC---", "Cubic Metres", "Litres", "Millilitres", "Cups",
				"Tablespoon", "Teaspoon", "---IMPERIAL---", "Cubic Feet", "Cubic Inches", "Gallons", "Quarts", "Pints",
				"Fluid Ounces", "US Cups", "US Tablespoon", "US Teaspoon"};
        String[] temperatures = {"Please Select", "Kelvin", "Celsius", "Fahrenheit"};

        control = new Controller(this);
        lengthPanel = new ConverterPanel(lengths, control);
        massPanel = new ConverterPanel(masses, control);
        volumePanel = new ConverterPanel(volumes, control);
        temperaturePanel = new ConverterPanel(temperatures, control);
        tabs = new JTabbedPane();

        init();
    }

    private void init() {
        setTitle("Converter");
        setLocationRelativeTo(null);
        setSize(400, 140);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(tabs);
        tabs.addTab("Length", lengthPanel);
        tabs.addTab("Mass", massPanel);
        tabs.addTab("Volume", volumePanel);
        tabs.addTab("Temperature", temperaturePanel);

        //pack();
        setVisible(true);
    }

    public ConverterPanel getSelectedPanel() {
        return (ConverterPanel) tabs.getSelectedComponent();
    }

    public String getSelectedPanelInput() {
        return getSelectedPanel().getInput();
    }

    public String getSelectedFromBox() {
        return getSelectedPanel().getFromSelection();
    }

    public String getSelectedToBox() {
        return getSelectedPanel().getToSelection();
    }

    public String getSelectedPanelName() {
        return tabs.getTitleAt(tabs.getSelectedIndex());
    }

    public void setSelectedPanelOutput(String output) {
        getSelectedPanel().setOutput(output);
    }

    public static void main(String[] args) {
        new ConverterFrame();
    }

}
