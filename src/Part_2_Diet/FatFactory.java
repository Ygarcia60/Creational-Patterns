package Part_2_Diet;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class FatFactory {
    private static final FatFactory INSTANCE =
            new FatFactory();

    private FatFactory() {
    }

    public static FatFactory getInstance() {
        return INSTANCE;
    }

    public String createFat(String dietPlan) {
        String diet = DietPlan.validate(dietPlan);
        List<String> choices;

        switch (diet) {
            case DietPlan.PALEO:
                choices = Arrays.asList(
                        "Avocado", "Tuna", "Peanuts"
                );
                break;

            case DietPlan.VEGAN:
                choices = Arrays.asList(
                        "Avocado", "Peanuts"
                );
                break;

            case DietPlan.NUT_ALLERGY:
                choices = Arrays.asList(
                        "Avocado", "Sour cream", "Tuna"
                );
                break;

            case DietPlan.NO_RESTRICTION:
                choices = Arrays.asList(
                        "Avocado", "Sour cream", "Tuna", "Peanuts"
                );
                break;

            default:
                throw new IllegalArgumentException(
                        "Unsupported diet: " + diet
                );
        }

        int index = ThreadLocalRandom.current()
                .nextInt(choices.size());

        return choices.get(index);
    }
}
