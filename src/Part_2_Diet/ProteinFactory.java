package Part_2_Diet;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class ProteinFactory {
    private static final ProteinFactory INSTANCE =
            new ProteinFactory();

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        return INSTANCE;
    }

    public String createProtein(String dietPlan) {
        String diet = DietPlan.validate(dietPlan);
        List<String> choices;

        switch (diet) {
            case DietPlan.PALEO:
                choices = Arrays.asList(
                        "Fish", "Chicken", "Beef"
                );
                break;

            case DietPlan.VEGAN:
                choices = Arrays.asList("Tofu");
                break;

            case DietPlan.NUT_ALLERGY:
            case DietPlan.NO_RESTRICTION:
                choices = Arrays.asList(
                        "Fish", "Chicken", "Beef", "Tofu"
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
