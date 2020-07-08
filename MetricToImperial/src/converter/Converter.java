package converter;

public class Converter {
	// Metre to imperial
	private final double METRES_TO_MILES = 6.213712E-4;
	private final double METRES_TO_YARDS = 1.093613;
	private final double METRES_TO_FEET = 3.28084;
	private final double METRES_TO_INCHES = 39.37;
	// metric to metre
	private final double KILOMETRES_TO_METRES = 1000;
	private final double DECIMETRES_TO_METRES = 0.1;
	private final double CENTIMETRES_TO_METRES = 0.01;
	private final double MILLIMETRES_TO_METRES = 0.001;

	private double metricToMetricFactor; // Converting metric measure to metres
	private double metricToImperialFactor; // Converting from metres to imperial measure

	public Converter(Length to, Length from) {
		setMetricToMetricFactor(to);
		setMetricToImperialFactor(from);
	}
	
	public Converter() {
		this(Length.METRES, Length.FEET);
	}

	public void setMetricToMetricFactor(Length to) {
		switch (to) {
		case MILLIMETRES:
			metricToMetricFactor = MILLIMETRES_TO_METRES;
			break;
		case CENTIMETRES:
			metricToMetricFactor = CENTIMETRES_TO_METRES;
			break;
		case DECIMETRES:
			metricToMetricFactor = DECIMETRES_TO_METRES;
			break;
		case METRES:
			metricToMetricFactor = 1;
			break;
		case KILOMETRES:
			metricToMetricFactor = KILOMETRES_TO_METRES;
			break;
		default:
			metricToMetricFactor = 1;
		}
	}

	public void setMetricToImperialFactor(Length from) {
		switch (from) {
		case MILES:
			metricToImperialFactor = METRES_TO_MILES;
			break;
		case YARDS:
			metricToImperialFactor = METRES_TO_YARDS;
			break;
		case FEET:
			metricToImperialFactor = METRES_TO_FEET;
			break;
		case INCHES:
			metricToImperialFactor = METRES_TO_INCHES;
			break;
		default:
			metricToImperialFactor = METRES_TO_FEET;
		}
	}
	
	public double convert(double measure) {
		return (measure * metricToMetricFactor) * metricToImperialFactor;
	}

	public static void main(String[] args) {
		new ConverterFrame();

	}
}
