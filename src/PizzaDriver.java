public class PizzaDriver {
    public static void main(String[] args) {
        System.out.println("Part 1: Three Pizza Hut pizzas");
        System.out.println();

        Pizza smallPizza = new PizzaBuilder("Pizza Hut","Small")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .build();

        Pizza mediumPizza = new PizzaBuilder("Pizza Hut", "Medium")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .build();

        Pizza largePizza = new PizzaBuilder("Pizza Hut","Large")
                .addTopping("Extra Cheese")
                .addTopping("Chicken")
                .addTopping("Spicy Pork")
                .addTopping("Bacon")
                .addTopping("Peppers")
                .addTopping("Pepperoni")
                .addTopping("Tomato and Basil")
                .addTopping("Ham")
                .addTopping("Pesto")
                .build();


        smallPizza.eat();
        mediumPizza.eat();
        largePizza.eat();

        System.out.println("Part 2: Three Pizza chains");
        System.out.println();

        Pizza hutLarge = new PizzaBuilder("Pizza Hut", "Large")
                .addTopping("Pepperoni")
                .addTopping("Peppers")
                .addTopping("Beef")
                .build();
        Pizza dominoLarge = new PizzaBuilder("Dominos", "Large")
                .addTopping("Pesto")
                .addTopping("Ham")
                .addTopping("Olives")
                .build();
        Pizza caesarMedium = new PizzaBuilder("Little Caesars", "Medium")
                .addTopping("Pepperoni")
                .addTopping("Peppers")
                .addTopping("Ham")
                .addTopping("Beef")
                .addTopping("Extra Cheese")
                .addTopping("Spinach")
                .addTopping("Spicy Pork")
                .addTopping("Onions")
                .build();
        Pizza hutSmall = new PizzaBuilder("Pizza Hut", "Small")
                .addTopping("Sausage")
                .addTopping("Pesto")
                .build();
        Pizza caesarSmall = new PizzaBuilder("Little Caesars", "Medium")
                .addTopping("Ham and Pineapple")
                .addTopping("Spinach")
                .addTopping("Beef")
                .addTopping("Bacon")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Onions")
                .addTopping("Tomato and Basil")
                .build();
        Pizza dominoSmall = new PizzaBuilder("Dominos", "Small")
                .addTopping("Extra Cheese")
                .build();


        hutLarge.eat();
        dominoLarge.eat();
        caesarMedium.eat();
        hutSmall.eat();
        caesarSmall.eat();
        dominoSmall.eat();


    }
}


