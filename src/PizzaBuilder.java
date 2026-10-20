import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PizzaBuilder {
    private final String chain;
    private final String size;
    private final List<String> toppings;

private static final List<String> VALID_CHAINS = Arrays.asList(
        "Pizza Hut",
        "Little Caesars",
        "Dominos"
);
private static final List<String> VALID_SIZES = Arrays.asList(
        "Small",
        "Medium",
        "Large"
);
private static final List<String> VALID_TOPPINGS = Arrays.asList(
        "Pepperoni",
        "Sausage",
        "Mushrooms",
        "Bacon",
        "Onions",
        "Extra Cheese",
        "Peppers",
        "Chicken",
        "Olives",
        "Spinach",
        "Tomato and Basil",
        "Beef",
        "Ham",
        "Pesto",
        "Spicy Pork",
        "Ham and Pineapple"
);

public PizzaBuilder(String chain, String size) {
    this.chain = chain;
    this.size = size;
    this.toppings = new ArrayList<>();

    if (!VALID_CHAINS.contains(chain)) {
        throw new IllegalArgumentException("Chain must be Pizza Hut, Little Caesars or Dominos."
        );
    }

    if (!VALID_SIZES.contains(size)){
        throw new IllegalArgumentException("Size is required and must be Small, Medium, or Large."
        );
    }

    //this.chain = chain;
    //this.size = size;
    //this.toppings = new ArrayList<>();
}
public PizzaBuilder addTopping(String topping) {
    if (!VALID_TOPPINGS.contains(topping)) {
        throw new IllegalArgumentException(
                "Invalid topping: " + topping
        );
    }

    if (!toppings.contains(topping)) {
        toppings.add(topping);
    }
    return this;
}

public Pizza build(){
    return new Pizza(chain, size, toppings);
    }
}

