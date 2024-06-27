// Menu.java
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Sandwich> sandwiches;

    public Menu() {
        sandwiches = new ArrayList<>();
        sandwiches.add(new Sandwich("Beef Burger", 80.0));
        sandwiches.add(new Sandwich("Chicken Burger", 75.0));
        sandwiches.add(new Sandwich("Cheese Burger", 85.0));
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public Sandwich getSandwich(int choice) {
        return sandwiches.get(choice - 1);
    }
}