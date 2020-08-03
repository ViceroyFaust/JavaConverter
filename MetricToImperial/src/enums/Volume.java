package enums;

public enum Volume {
    /* US Customary */ CUBIC_FT ("Cubic Foot"), GALLON ("Gallon"), QUART ("Quart"), PINT ("Pint"), US_CUP ("US Cup"), OUNCE ("Ounce"),
    CUBIC_IN ("Cubic Inch"), US_TBSP ("US Tablespoon"), US_TSP ("US Teaspoon"),
    /* SI Metric */ CUBIC_METRE ("Cubic Metre"), LITRE ("Litre"), SI_CUP ("Metric Cup"),
    SI_TBSP ("Metric Tablespoon"), SI_TSP ("Metric Teaspoon"), MILLILITRE ("Millilitre");

    private String desc;
    Volume(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
