package converters;

import enums.Mass;

public class MassConverter {
    public final double KILOGRAMMES;
    // Kilogramme to Imperial measures
    public final double TO_TON = 1.1023113E-3;
    public final double TO_POUND = 0.45359237;
    public final double TO_OUNCE = 2.83495231E-2;
    // Kilogramme to other SI factors
    public final double TO_TONNE = .001;
    public final double TO_GRAMME = 1000;
    public final double TO_MILLI = 1E-6;

    public MassConverter(Mass unit, double unitVal) {
        switch (unit) {
            case TONNE:
                KILOGRAMMES = unitVal / TO_TONNE;
                break;
            case KILOGRAMME:
                KILOGRAMMES = unitVal;
                break;
            case GRAMME:
                KILOGRAMMES = unitVal / TO_GRAMME;
                break;
            case MILLIGRAMME:
                KILOGRAMMES = unitVal / TO_MILLI;
                break;
            case TON:
                KILOGRAMMES = unitVal / TO_TON;
                break;
            case POUND:
                KILOGRAMMES = unitVal / TO_POUND;
                break;
            case OUNCE:
                KILOGRAMMES = unitVal / TO_OUNCE;
                break;
            default:
                KILOGRAMMES = 0; // This should not be possible
        }
    }

    public double convert(Mass measure) {
        double output;
        switch (measure) {
            case TONNE:
                output = KILOGRAMMES * TO_TONNE;
                break;
            case KILOGRAMME:
                output = KILOGRAMMES;
                break;
            case GRAMME:
                output = KILOGRAMMES * TO_GRAMME;
                break;
            case MILLIGRAMME:
                output = KILOGRAMMES * TO_MILLI;
                break;
            case TON:
                output = KILOGRAMMES * TO_TON;
                break;
            case POUND:
                output = KILOGRAMMES * TO_POUND;
                break;
            case OUNCE:
                output = KILOGRAMMES * TO_OUNCE;
                break;
            default:
                output = 0; // This should not be possible

        }
        return output;
    }
}
