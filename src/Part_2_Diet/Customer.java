package Part_2_Diet;

public class Customer{
    private final String name;
    private final String dietPlan;

    public Customer(String name, String dietPlan) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Customer name is required."
            );
        }

        this.name = name.trim();
        this.dietPlan = DietPlan.validate(dietPlan);
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }
}
