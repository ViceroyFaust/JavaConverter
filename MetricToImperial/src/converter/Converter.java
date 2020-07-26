package converter;

public class Converter {
    // Metre to imperial factors
    private final double METRES_TO_MILES = 6.213712E-4;
    private final double METRES_TO_YARDS = 1.093613;
    private final double METRES_TO_FEET = 3.28084;
    private final double METRES_TO_INCHES = 39.37;
    // metric to metre factors
    private final double KILOMETRES_TO_METRES = 1000;
    private final double DECIMETRES_TO_METRES = 0.1;
    private final double CENTIMETRES_TO_METRES = 0.01;
    private final double MILLIMETRES_TO_METRES = 0.001;

    private double fromFactor; // Converting metric measure to metres
    private double toFactor; // Converting from metres to imperial measure

    public Converter(Length to, Length from) {
        setFromFactor(to);
        setToFactor(from);
    }

    public Converter() {
        this(Length.METRES, Length.FEET);
    }

    public void setFromFactor(Length to) { // Selects from which unit to convert
        switch (to) {
            case MILLIMETRES:
                fromFactor = MILLIMETRES_TO_METRES;
                break;
            case CENTIMETRES:
                fromFactor = CENTIMETRES_TO_METRES;
                break;
            case DECIMETRES:
                fromFactor = DECIMETRES_TO_METRES;
                break;
            case METRES:
                fromFactor = 1;
                break;
            case KILOMETRES:
                fromFactor = KILOMETRES_TO_METRES;
                break;
            case MILES:
                fromFactor = 1 / METRES_TO_MILES;
                break;
            case YARDS:
                fromFactor = 1 / METRES_TO_YARDS;
                break;
            case FEET:
                fromFactor = 1 / METRES_TO_FEET;
                break;
            case INCHES:
                fromFactor = 1 / METRES_TO_INCHES;
                break;
            default:
                fromFactor = 1;
        }
    }

    public void setToFactor(Length from) { // Selects which unit to convert to
        switch (from) {
            case MILES:
                toFactor = METRES_TO_MILES;
                break;
            case YARDS:
                toFactor = METRES_TO_YARDS;
                break;
            case FEET:
                toFactor = METRES_TO_FEET;
                break;
            case INCHES:
                toFactor = METRES_TO_INCHES;
                break;
            case KILOMETRES:
                toFactor = 1 / KILOMETRES_TO_METRES;
                break;
            case METRES:
                toFactor = 1;
                break;
            case DECIMETRES:
                toFactor = 1 / DECIMETRES_TO_METRES;
                break;
            case CENTIMETRES:
                toFactor = 1 / CENTIMETRES_TO_METRES;
                break;
            case MILLIMETRES:
                toFactor = 1 / MILLIMETRES_TO_METRES;
                break;
            default:
                toFactor = METRES_TO_FEET;
        }
    }

    public double convert(double measure) {
        return (measure * fromFactor) * toFactor;
    }

    public static void main(String[] args) {
        new ConverterFrame();

    }
}
