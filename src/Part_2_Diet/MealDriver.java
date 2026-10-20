package Part_2_Diet;

public class MealDriver {

    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Youseff", DietPlan.NO_RESTRICTION),
                new Customer("Alex", DietPlan.PALEO),
                new Customer("Maria", DietPlan.VEGAN),
                new Customer("Jordan", DietPlan.NUT_ALLERGY),
                new Customer("Sam", DietPlan.PALEO),
                new Customer("Taylor", DietPlan.VEGAN)
        };

        MacronutrientFactory factory =
                MacronutrientFactory.getInstance();

        for (Customer customer : customers) {
            Meal meal = factory.createMeal(customer);

            System.out.println("Customer: " + customer.getName());
            System.out.println("Diet: " + customer.getDietPlan());
            System.out.println(meal);
            System.out.println();
        }

    }
}
