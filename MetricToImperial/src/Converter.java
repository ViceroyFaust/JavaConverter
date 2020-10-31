public final class Converter {
    // SI Prefixes (Unused ones are commented out)
    private static final double MEGA = 1000000;
    private static final double KILO = 1000;
    // private static final double HECTO = 100;
    // private static final double DECA = 10;
    private static final double DECI = 0.1;
    private static final double CENTI = 0.01;
    private static final double MILLI = 0.001;
    // private static final double MICRO = 0.000001;
    // Non SI metric measurements
    private static final double MCUP_TO_L = 0.25;
    private static final double MTBSP_TO_L = 0.015;
    private static final double MTSP_TO_L = 0.005;

    /* === Lengths ===
     * This program converts to Metres first
     * Imperial to Metres conversion */
    private static final double MILES_TO_METRES = 1609.344;
    private static final double YARDS_TO_METRES = 0.9144;
    private static final double FEET_TO_METRES = 0.3048;
    private static final double INCHES_TO_METRES = 0.0254;


    /* === MASS ===
     *  This program converts into Grammes first
     *  Imperial to Grammes */
    private static final double TONS_TO_G = 907184.74;
    private static final double POUNDS_TO_G = 453.59237;
    private static final double OUNCES_TO_G = 28.349523125;

    /* === Volumes ===
     *  This program converts into Litres first
     *  Imperial to Litres */
    private static final double CFT_TO_L = 28.316847;
    private static final double GALLONS_TO_L = 3.785411784;
    private static final double QUARTS_TO_L = 0.946352946;
    private static final double PINTS_TO_L = 0.473176473;
    private static final double USCUP_TO_L = 0.2365882365;
    private static final double FLOUNCE_TO_L = 0.0295735295625;
    private static final double CIN_TO_L = 0.016387064;
    private static final double USTBSP_TO_L = 0.01478676478125;
    private static final double USTSP_TO_L = 0.00492892159375;

    /* === Temperatures ===
     *  This program converts into Kelvin first.
     *  Due to temperatures requiring a formula rather than a
     *  single factor for conversion, all of the math is
     *  handled inside the switch statement. */

    /* In Order to differentiate different types of units (such
     * as ounces being measurements for both mass and volume)
     * all of the cases will be assigned a tag.
     *  Length = -L
     *  Mass = -M
     *  Volume = -V
     *  Temperature = -T */

    public static double convert(String fromUnit, String toUnit, double measure) {
        double output;
        switch (fromUnit) { // At first the unit is converted into SI ones place
            /* MEGA UNITS */
            case "TONNES-M":
                output = measure * MEGA;
                break;
            /* KILO UNITS */
            case "KILOMETRES-L":
            case "KILOGRAMMES-M":
            case "CUBIC METRES-V":
                output = measure * KILO;
                break;
            /* ONES UNITS */
            case "METRES-L":
            case "GRAMMES-M":
            case "LITRES-V":
            case "KELVIN-T":
                output = measure;
                break;
            /* DECI UNITS */
            case "DECIMETRES-L":
                output = measure * DECI;
                break;
            /* CENTI UNITS */
            case "CENTIMETRES-L":
                output = measure * CENTI;
                break;
            /* MILLI UNITS */
            case "MILLIMETRES-L":
            case "MILLIGRAMMES-M":
            case "MILLILITRES-V":
                output = measure * MILLI;
                break;
            /* LENGTHS */
            case "MILES-L":
                output = measure * MILES_TO_METRES;
                break;
            case "YARDS-L":
                output = measure * YARDS_TO_METRES;
                break;
            case "FEET-L":
                output = measure * FEET_TO_METRES;
                break;
            case "INCHES-L":
                output = measure * INCHES_TO_METRES;
                break;
            /* MASS */
            case "TONS-M":
                output = measure * TONS_TO_G;
                break;
            case "POUNDS-M":
                output = measure * POUNDS_TO_G;
                break;
            case "OUNCES-M":
                output = measure * OUNCES_TO_G;
                break;
            /* VOLUMES */
            case "CUPS-V":
                output = measure * MCUP_TO_L;
                break;
            case "TABLESPOON-V":
                output = measure * MTBSP_TO_L;
                break;
            case "TEASPOON-V":
                output = measure * MTSP_TO_L;
                break;
            case "CUBIC FEET-V":
                output = measure * CFT_TO_L;
                break;
            case "GALLONS-V":
                output = measure * GALLONS_TO_L;
                break;
            case "QUARTS-V":
                output = measure * QUARTS_TO_L;
                break;
            case "PINTS-V":
                output = measure * PINTS_TO_L;
                break;
            case "US CUPS-V":
                output = measure * USCUP_TO_L;
                break;
            case "FLUID OUNCES-V":
                output = measure * FLOUNCE_TO_L;
                break;
            case "CUBIC INCHES-V":
                output = measure * CIN_TO_L;
                break;
            case "US TABLESPOON-V":
                output = measure * USTBSP_TO_L;
                break;
            case "US TEASPOON-V":
                output = measure * USTSP_TO_L;
                break;
            /* TEMPERATURES */
            case "CELSIUS-T":
                output = measure + 273.15;
                break;
            case "FAHRENHEIT-T":
                output = (measure + 459.67) * (5.0 / 9.0);
                break;
            default:
                output = -1; // For unrecognised input
        }

        switch (toUnit) { // At first the unit is converted into SI one place
            /* MEGA UNITS */
            case "TONNES-M":
                output /= MEGA;
                break;
            /* KILO UNITS */
            case "KILOMETRES-L":
            case "KILOGRAMMES-M":
            case "CUBIC METRES-V":
                output /= KILO;
                break;
            /* ONES UNITS */
            case "METRES-L":
            case "GRAMMES-M":
            case "LITRES-V":
            case "KELVIN-T":
                output *= 1;
                break;
            /* DECI UNITS */
            case "DECIMETRES-L":
                output /= DECI;
                break;
            /* CENTI UNITS */
            case "CENTIMETRES-L":
                output /= CENTI;
                break;
            /* MILLI UNITS */
            case "MILLIMETRES-L":
            case "MILLIGRAMMES-M":
            case "MILLILITRES-V":
                output /= MILLI;
                break;
            /* LENGTHS */
            case "MILES-L":
                output /= MILES_TO_METRES;
                break;
            case "YARDS-L":
                output /= YARDS_TO_METRES;
                break;
            case "FEET-L":
                output /= FEET_TO_METRES;
                break;
            case "INCHES-L":
                output /= INCHES_TO_METRES;
                break;
            /* MASS */
            case "TONS-M":
                output /= TONS_TO_G;
                break;
            case "POUNDS-M":
                output /= POUNDS_TO_G;
                break;
            case "OUNCES-M":
                output /= OUNCES_TO_G;
                break;
            /* VOLUMES */
            case "CUPS-V":
                output /= MCUP_TO_L;
                break;
            case "TABLESPOON-V":
                output /= MTBSP_TO_L;
                break;
            case "TEASPOON-V":
                output /= MTSP_TO_L;
                break;
            case "CUBIC FEET-V":
                output /= CFT_TO_L;
                break;
            case "GALLONS-V":
                output /= GALLONS_TO_L;
                break;
            case "QUARTS-V":
                output /= QUARTS_TO_L;
                break;
            case "PINTS-V":
                output /= PINTS_TO_L;
                break;
            case "US CUPS-V":
                output /= USCUP_TO_L;
                break;
            case "FLUID OUNCES-V":
                output /= FLOUNCE_TO_L;
                break;
            case "CUBIC INCHES-V":
                output /= CIN_TO_L;
                break;
            case "US TABLESPOON-V":
                output /= USTBSP_TO_L;
                break;
            case "US TEASPOON-V":
                output /= USTSP_TO_L;
                break;
            /* TEMPERATURES */
            case "CELSIUS-T":
                output -= 273.15;
                break;
            case "FAHRENHEIT-T":
                output = output * (9.0 / 5.0) - 459.67;
                break;
            default:
                output = -1; // For unrecognised input
        }

        return output;
    }
}
