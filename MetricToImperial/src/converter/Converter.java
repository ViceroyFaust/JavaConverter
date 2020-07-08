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

	private double toMetresFactor; // Converting metric measure to metres
	private double fromMetresFactor; // Converting from metres to imperial measure

	public Converter(Length to, Length from) {
		setToFactor(to);
		setFromFactor(from);
	}
	
	public Converter() {
		this(Length.METRES, Length.FEET);
	}

	public void setToFactor(Length to) {
		switch (to) {
		case MILLIMETRES:
			toMetresFactor = MILLIMETRES_TO_METRES;
			break;
		case CENTIMETRES:
			toMetresFactor = CENTIMETRES_TO_METRES;
			break;
		case DECIMETRES:
			toMetresFactor = DECIMETRES_TO_METRES;
			break;
		case METRES:
			toMetresFactor = 1;
			break;
		case KILOMETRES:
			toMetresFactor = KILOMETRES_TO_METRES;
			break;
		default:
			toMetresFactor = 1;
		}
	}

	public void setFromFactor(Length from) {
		switch (from) {
		case MILES:
			fromMetresFactor = METRES_TO_MILES;
			break;
		case YARDS:
			fromMetresFactor = METRES_TO_YARDS;
			break;
		case FEET:
			fromMetresFactor = METRES_TO_FEET;
			break;
		case INCHES:
			fromMetresFactor = METRES_TO_INCHES;
			break;
		default:
			fromMetresFactor = METRES_TO_FEET;
		}
	}

	public static void main(String[] args) {
		new ConverterFrame();

	}
}
