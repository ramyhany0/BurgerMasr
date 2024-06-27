// UserMain.java
import java.util.Scanner;

public class UserMain {
    private Sandwich sandwich;
    private Menu menu;
    private Additions additions;

    public UserMain() {
        menu = new Menu();
        additions = new Additions();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to BurgerMasr!");
        System.out.println("---------------------");

        // Show the menu
        showMenu();

        // Get the user's choice
        System.out.print("Please select the sandwich you want (enter the number): ");
        int sandwichChoice = scanner.nextInt();
        scanner.nextLine(); // newline character

        sandwich = menu.getSandwich(sandwichChoice);

        // Ask for additions
        System.out.println("Do you want any additions? (Y/N)");
        String additionsChoice = scanner.nextLine().toUpperCase();

        if (additionsChoice.equals("Y")) {
            showAdditions();
            System.out.println("Please select your desired additions (e.g., 1, 2, 3): ");
            String additionNumbers = scanner.nextLine();
            String[] chosenAdditions = additionNumbers.split(",");
            for (String addition : chosenAdditions) {
                int additionIndex = Integer.parseInt(addition.trim()) - 1;
                sandwich.addAddition(additions.getAddition(additionIndex));
            }
        }

        // Calculate and display the receipt
        double totalCost = sandwich.calculatePrice();
        System.out.println("\nReceipt:");
        System.out.println("---------------------");
        System.out.println(sandwich.getName() + " : " + sandwich.getPrice());
        System.out.println("Additions:");
        for (Addition addition : sandwich.getAdditions()) {
            System.out.println("- " + addition.getName() + " : " + addition.getPrice());
        }
        System.out.println("---------------------");
        System.out.println("Total: " + totalCost);
        System.out.println("---------------------");
    }

    private void showMenu() {
        System.out.println("Menu:");
        System.out.println("---------------------");
        for (int i = 0; i < menu.getSandwiches().size(); i++) {
            System.out.println((i + 1) + " - " + menu.getSandwiches().get(i).getName());
        }
        System.out.println("---------------------");
    }

    private void showAdditions() {
        System.out.println("Additions:");
        System.out.println("---------------------");
        for (int i = 0; i < additions.getAdditions().size(); i++) {
            System.out.println((i + 1) + " - " + additions.getAdditions().get(i).getName() + " (" + additions.getAdditions().get(i).getPrice() + ")");
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        UserMain userMain = new UserMain();
        userMain.run();
    }
}









