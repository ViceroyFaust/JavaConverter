package converters;

import enums.Temperature;

public class TemperatureConverter {
    public final double UNITS_KELVIN;

    public TemperatureConverter(Temperature unit, double unitVal) {
        switch (unit) {
            case KELVIN:
                UNITS_KELVIN = unitVal;
                break;
            case CELSIUS:
                UNITS_KELVIN = unitVal + 273.15;
                break;
            case FAHRENHEIT:
                UNITS_KELVIN = (unitVal + 459.67) * (5.0 / 9.0);
                break;
            default:
                UNITS_KELVIN = 0; // This should not be possible
        }
    }

    public double convert(Temperature unit) {
        double output;
        switch (unit) {
            case KELVIN:
                output = UNITS_KELVIN;
                break;
            case CELSIUS:
                output = UNITS_KELVIN - 273.15;
                break;
            case FAHRENHEIT:
                output = UNITS_KELVIN * (9.0 / 5.0) - 459.67;
                break;
            default:
                output = 0; // This should not be possible
        }
        return output;
    }
}
