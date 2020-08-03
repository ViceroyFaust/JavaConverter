package enums;

public enum Mass {
    /* Metric */ TONNE ("Tonne"), KILOGRAMME ("Kilogramme"), GRAMME ("Gramme"), MILLIGRAMME ("Milligramme"),
    /* US Customary */ TON ("Ton"), POUND ("Pound"), OUNCE ("Ounce");

    private String desc;
    Mass (String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
