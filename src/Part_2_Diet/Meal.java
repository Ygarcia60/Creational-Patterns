package Part_2_Diet;

public class Meal {
    private final String carb;
    private final String protein;
    private final String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public String getCarb() {
        return carb;
    }

    public String getProtein() {
        return protein;
    }

    public String getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "Carb: " + carb
                + "\nProtein: " + protein
                + "\nFat: " + fat;
    }
}