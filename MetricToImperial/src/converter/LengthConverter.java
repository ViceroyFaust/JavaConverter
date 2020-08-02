package converter;

public class LengthConverter {
    public final double METRES;
    // Metre to imperial factors
    public final double TO_MILES = 6.213712E-4;
    public final double TO_YARDS = 1.093613;
    public final double TO_FEET = 3.28084;
    public final double TO_INCHES = 39.37;
    // metric to metre factors
    public final double TO_KILO = .001;
    public final double TO_DECI = 10;
    public final double TO_CENTI = 100;
    public final double TO_MILLI = 1000;

    public enum Length {
        /* Metric */ KILOMETRE, METRE, DECIMETRE, CENTIMETRE, MILLIMETRE,
        /* US Customary */ MILE, YARD, FOOT, INCH
    }

    public LengthConverter(Length unit, double unitVal) {
            switch (unit) {
                case KILOMETRE:
                    METRES = unitVal / TO_KILO;
                    break;
                case METRE:
                    METRES = unitVal;
                    break;
                case DECIMETRE:
                    METRES = unitVal / TO_DECI;
                    break;
                case CENTIMETRE:
                    METRES = unitVal / TO_CENTI;
                    break;
                case MILLIMETRE:
                    METRES = unitVal / TO_MILLI;
                    break;
                case MILE:
                    METRES = unitVal / TO_MILES;
                    break;
                case YARD:
                    METRES = unitVal / TO_YARDS;
                    break;
                case FOOT:
                    METRES = unitVal / TO_FEET;
                    break;
                case INCH:
                    METRES = unitVal / TO_INCHES;
                    break;
                default:
                    METRES = 0; // Should not be possible to get this result

            }
    }

    public double convert(Length toConvert) {
        double out;
        switch (toConvert) {
            case KILOMETRE:
                out = METRES * TO_KILO;
                break;
            case METRE:
                out = METRES;
                break;
            case DECIMETRE:
                out = METRES * TO_DECI;
                break;
            case CENTIMETRE:
                out = METRES * TO_CENTI;
                break;
            case MILLIMETRE:
                out = METRES * TO_MILLI;
                break;
            case MILE:
                out = METRES * TO_MILES;
                break;
            case YARD:
                out = METRES * TO_YARDS;
                break;
            case FOOT:
                out = METRES * TO_FEET;
                break;
            case INCH:
                out = METRES * TO_INCHES;
                break;
            default:
                out = 0; // Should not be possible to get this result
        }
        return out;
    }

}
