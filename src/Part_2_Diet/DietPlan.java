package Part_2_Diet;

public final class DietPlan {
    public static final String NO_RESTRICTION = "No Restriction";
    public static final String PALEO = "Paleo";
    public static final String VEGAN = "Vegan";
    public static final String NUT_ALLERGY = "Nut Allergy";

    private DietPlan() {
    }

    public static String validate(String diet) {
        if (diet == null) {
            throw new IllegalArgumentException("Diet plan is required.");
        }

        String cleaned = diet.trim();

        if (cleaned.equalsIgnoreCase(NO_RESTRICTION)) {
            return NO_RESTRICTION;
        } else if (cleaned.equalsIgnoreCase(PALEO)) {
            return PALEO;
        } else if (cleaned.equalsIgnoreCase(VEGAN)) {
            return VEGAN;
        } else if (cleaned.equalsIgnoreCase(NUT_ALLERGY)) {
            return NUT_ALLERGY;
        }

        throw new IllegalArgumentException(
                "Unknown diet plan: " + diet
        );
    }
}
