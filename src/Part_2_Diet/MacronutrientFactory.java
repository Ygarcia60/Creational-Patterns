package Part_2_Diet;

public final class MacronutrientFactory {
    private static final MacronutrientFactory INSTANCE =
            new MacronutrientFactory();

    private MacronutrientFactory() {
    }

    public static MacronutrientFactory getInstance() {
        return INSTANCE;
    }

    public CarbFactory getCarbFactory() {
        return CarbFactory.getInstance();
    }

    public ProteinFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }

    public FatFactory getFatFactory() {
        return FatFactory.getInstance();
    }

    public Meal createMeal(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException(
                    "Customer is required."
            );
        }

        String diet = customer.getDietPlan();

        String carb = getCarbFactory().createCarb(diet);
        String protein = getProteinFactory().createProtein(diet);
        String fat = getFatFactory().createFat(diet);

        return new Meal(carb, protein, fat);
    }
}
