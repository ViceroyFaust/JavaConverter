package converter;

public class Converter {
	// Metre to imperial
	private static final double METRES_TO_MILES = 6.213712E-4;
	private static final double METRES_TO_YARDS = 1.093613;
	private static final double METRES_TO_FEET = 3.28084;
	private static final double METRES_TO_INCHES = 39.37;
	// metric to metre
	private static final double KILOMETRES_TO_METRES = 1000;
	private static final double DECIMETRES_TO_METRES = 0.1;
	private static final double CENTIMETRES_TO_METRES = 0.01;
	private static final double MILLIMETRES_TO_METRES = 0.001;

	public static void main(String[] args) {
		new ConverterFrame();

	}
}
