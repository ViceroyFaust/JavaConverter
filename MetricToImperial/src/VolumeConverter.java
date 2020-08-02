public class VolumeConverter {
    public final double CUBIC_METRES;
    // Cubic Metres to Imperial measures (fluid)
    public final double TO_CUBIC_FT = 35.31466672;
    public final double TO_GALLON = 264.1729524;
    public final double TO_QUART = 1056.688209;
    public final double TO_PINT = 2113.376419;
    public final double TO_US_CUP = 4226.752838;
    public final double TO_OUNCE = 33814.0227;
    public final double TO_CUBIC_IN = 61023.74409;
    public final double TO_US_TBSP = 67628.0454;
    public final double TO_US_TSP = 202884.1362;
    // Cubic Metres to other SI factors
    public final double TO_LITRE = 1000;
    public final double TO_SI_CUP = 4000;
    public final double TO_SI_TBSP = 66666.66667;
    public final double TO_SI_TSP = 200000;
    public final double TO_ML = 1E6;

    public enum Volume {
        /* US Customary */ CUBIC_FT, GALLON, QUART, PINT, US_CUP, OUNCE, CUBIC_IN, US_TBSP, US_TSP,
        /* SI Metric */ CUBIC_METRE, LITRE, SI_CUP, SI_TBSP, SI_TSP, MILLILITRE
    }

    public VolumeConverter(Volume unit, double unitVal) {
        switch (unit) {
            case CUBIC_FT:
                CUBIC_METRES = unitVal / TO_CUBIC_FT;
                break;
            case GALLON:
                CUBIC_METRES = unitVal / TO_GALLON;
                break;
            case QUART:
                CUBIC_METRES = unitVal / TO_QUART;
                break;
            case PINT:
                CUBIC_METRES = unitVal / TO_PINT;
                break;
            case US_CUP:
                CUBIC_METRES = unitVal / TO_US_CUP;
                break;
            case OUNCE:
                CUBIC_METRES = unitVal / TO_OUNCE;
                break;
            case CUBIC_IN:
                CUBIC_METRES = unitVal / TO_CUBIC_IN;
                break;
            case US_TBSP:
                CUBIC_METRES = unitVal / TO_US_TBSP;
                break;
            case US_TSP:
                CUBIC_METRES = unitVal / TO_US_TSP;
                break;
            case CUBIC_METRE:
                CUBIC_METRES = unitVal;
                break;
            case LITRE:
                CUBIC_METRES = unitVal / TO_LITRE;
                break;
            case SI_CUP:
                CUBIC_METRES = unitVal / TO_SI_CUP;
                break;
            case SI_TBSP:
                CUBIC_METRES = unitVal / TO_SI_TBSP;
                break;
            case SI_TSP:
                CUBIC_METRES = unitVal / TO_SI_TSP;
                break;
            case MILLILITRE:
                CUBIC_METRES = unitVal / TO_ML;
                break;
            default:
                CUBIC_METRES = 0; // This should not be possible
        }
    }

    public double convert(Volume unit) {
        double output;
        switch (unit) {
            case CUBIC_FT:
                 output = CUBIC_METRES * TO_CUBIC_FT;
                break;
            case GALLON:
                output = CUBIC_METRES * TO_GALLON;
                break;
            case QUART:
                output = CUBIC_METRES * TO_QUART;
                break;
            case PINT:
                output = CUBIC_METRES * TO_PINT;
                break;
            case US_CUP:
                output = CUBIC_METRES * TO_US_CUP;
                break;
            case OUNCE:
                output = CUBIC_METRES * TO_OUNCE;
                break;
            case CUBIC_IN:
                output = CUBIC_METRES * TO_CUBIC_IN;
                break;
            case US_TBSP:
                output = CUBIC_METRES * TO_US_TBSP;
                break;
            case US_TSP:
                output = CUBIC_METRES * TO_US_TSP;
                break;
            case CUBIC_METRE:
                output = CUBIC_METRES;
                break;
            case LITRE:
                output = CUBIC_METRES * TO_LITRE;
                break;
            case SI_CUP:
                output = CUBIC_METRES * TO_SI_CUP;
                break;
            case SI_TBSP:
                output = CUBIC_METRES * TO_SI_TBSP;
                break;
            case SI_TSP:
                output = CUBIC_METRES * TO_SI_TSP;
                break;
            case MILLILITRE:
                output = CUBIC_METRES * TO_ML;
                break;
            default:
                output = 0; // This should not be possible
        }
        return output;
    }
}
