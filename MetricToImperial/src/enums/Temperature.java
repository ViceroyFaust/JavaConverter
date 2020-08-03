package enums;

public enum Temperature {
    KELVIN ("K"), CELSIUS ("℃"), FAHRENHEIT ("°F ");

    private String desc;
    Temperature(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
