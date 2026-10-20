package Part_2_Diet;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class CarbFactory {
    private static final CarbFactory INSTANCE =
            new CarbFactory();

    private CarbFactory() {
    }

    public static CarbFactory getInstance() {
        return INSTANCE;
    }

    public String createCarb(String dietPlan) {
        String diet = DietPlan.validate(dietPlan);
        List<String> choices;

        switch (diet) {
            case DietPlan.PALEO:
                choices = Arrays.asList("Pistachio");
                break;

            case DietPlan.VEGAN:
                choices = Arrays.asList(
                        "Bread", "Lentils", "Pistachio"
                );
                break;

            case DietPlan.NUT_ALLERGY:
                choices = Arrays.asList(
                        "Cheese", "Bread", "Lentils"
                );
                break;

            case DietPlan.NO_RESTRICTION:
                choices = Arrays.asList(
                        "Cheese", "Bread", "Lentils", "Pistachio"
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
