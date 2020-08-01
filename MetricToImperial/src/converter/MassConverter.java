package converter;

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

    public enum Weight {
        /* Metric */ TONNE, KILOGRAMME, GRAMME, MILLIGRAMME,
        /* US Customary */ TON, POUND, OUNCE
    }

    public MassConverter(Weight measure, double mass) {
        switch (measure) {
            case TONNE:
                KILOGRAMMES = mass / TO_TONNE;
                break;
            case KILOGRAMME:
                KILOGRAMMES = mass;
                break;
            case GRAMME:
                KILOGRAMMES = mass / TO_GRAMME;
                break;
            case MILLIGRAMME:
                KILOGRAMMES = mass / TO_MILLI;
                break;
            case TON:
                KILOGRAMMES = mass / TO_TON;
                break;
            case POUND:
                KILOGRAMMES = mass / TO_POUND;
                break;
            case OUNCE:
                KILOGRAMMES = mass / TO_OUNCE;
                break;
            default:
                KILOGRAMMES = 0; // This should not be possible
        }
    }

    public double convert(Weight measure) {
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
