package enums;

public enum Length {
    /* Metric */ KILOMETRE ("Kilometre"), METRE ("Metre"), DECIMETRE ("Decimetre"), CENTIMETRE ("Centimetre"), MILLIMETRE ("Millimetre"),
    /* US Customary */ MILE ("Mile"), YARD ("Yard"), FOOT ("Foot"), INCH ("Inch");

    private String desc;
    Length (String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
