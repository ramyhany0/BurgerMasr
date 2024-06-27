
import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String name;
    private double price;
    private List<Addition> additions;

    public Sandwich(String name, double price) {
        this.name = name;
        this.price = price;
        this.additions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void addAddition(Addition addition) {
        additions.add(addition);
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    public double calculatePrice() {
        double totalPrice = price;
        for (Addition addition : additions) {
            totalPrice += addition.getPrice();
        }
        return totalPrice;
    }
}