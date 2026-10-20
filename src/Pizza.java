import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String chain;
    private final String size;
    private final List<String> toppings;

    Pizza(String chain, String size, List<String> toppings){
        this.chain = chain;
        this.size = size;

        this.toppings = new ArrayList<>(toppings);
    }
    public void eat() {
        System.out.println("Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Topping count: " + toppings.size());

        if (toppings.isEmpty()) {
            System.out.println("Toppings: None");
        } else {
            System.out.println("Toppings" + String.join(", ", toppings));
        }
    }}
