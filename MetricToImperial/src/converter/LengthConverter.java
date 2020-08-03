package converter;

public final class LengthConverter {
    // The base unit for length is a Metre (SI)
    // Metre to imperial factors
    private static final double MILES_TO_METRES = 1609.344;
    private static final double YARDS_TO_METRES = 0.9144;
    private static final double FEET_TO_METRES = 0.3048;
    private static final double INCHES_TO_METRES = 0.0254;
    // metric to metre factors
    private static final double TO_KILO = 0.001;
    private static final double TO_DECI = 10;
    private static final double TO_CENTI = 100;
    private static final double TO_MILLI = 1000;

    public static double convert(String fromUnit, String toUnit, double measure) {
        double output;
        switch (fromUnit) { // At first the unit is converter into metres
            case "KILOMETRES":
                output = measure / TO_KILO;
                break;
            case "METRES":
                output = measure;
                break;
            case "DECIMETRES":
                output = measure / TO_DECI;
                break;
            case "CENTIMETRES":
                output = measure / TO_CENTI;
                break;
            case "MILLIMETRES":
                output = measure / TO_MILLI;
                break;
            case "MILES":
                output = measure * MILES_TO_METRES;
                break;
            case "YARDS":
                output = measure * YARDS_TO_METRES;
                break;
            case "FEET":
                output = measure * FEET_TO_METRES;
                break;
            case "INCHES":
                output = measure * INCHES_TO_METRES;
                break;
            default:
                output = 0; // For unrecognised input
        }

        switch (toUnit) { // Conversion from Metres to the desired unit
            case "KILOMETRES":
                output *= TO_KILO;
                break;
            case "METRES":
                output *= 1;
                break;
            case "DECIMETRES":
                output *= TO_DECI;
                break;
            case "CENTIMETRES":
                output *= TO_CENTI;
                break;
            case "MILLIMETRES":
                output *= TO_MILLI;
                break;
            case "MILES":
                output /= MILES_TO_METRES;
                break;
            case "YARDS":
                output /= YARDS_TO_METRES;
                break;
            case "FEET":
                output /= FEET_TO_METRES;
                break;
            case "INCHES":
                output /= INCHES_TO_METRES;
                break;
        }

        return output;
    }
}
