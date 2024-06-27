
import java.util.Scanner;

public class AdminMain {
    private Menu menu;
    private Additions additions;

    public AdminMain() {
        menu = new Menu();
        additions = new Additions();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Main loop for admin actions
        while (true) {
            System.out.println("\nAdmin Panel:");
            System.out.println("---------------------");
            System.out.println("1- View Menu");
            System.out.println("2- View Additions");
            System.out.println("3- Add New Item to Menu");
            System.out.println("4- Add New Addition");
            System.out.println("5- Exit");
            System.out.println("---------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //  newline character

            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    viewAdditions();
                    break;
                case 3:
                    addNewItemToMenu();
                    break;
                case 4:
                    addNewAddition();
                    break;
                case 5:
                    System.out.println("Exiting Admin Panel...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void viewMenu() {
        System.out.println("\nCurrent Menu:");
        System.out.println("---------------------");
        for (int i = 0; i < menu.getSandwiches().size(); i++) {
            System.out.println((i + 1) + " - " + menu.getSandwiches().get(i).getName() + " (" + menu.getSandwiches().get(i).getPrice() + ")");
        }
        System.out.println("---------------------");
    }

    private void viewAdditions() {
        System.out.println("\nCurrent Additions:");
        System.out.println("---------------------");
        for (int i = 0; i < additions.getAdditions().size(); i++) {
            System.out.println((i + 1) + " - " + additions.getAdditions().get(i).getName() + " (" + additions.getAdditions().get(i).getPrice() + ")");
        }
        System.out.println("---------------------");
    }

    private void addNewItemToMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new sandwich name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new sandwich price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); //  newline character
        menu.getSandwiches().add(new Sandwich(name, price));
        System.out.println("New sandwich added successfully!");
    }

    private void addNewAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new addition name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new addition price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); //  newline character
        additions.getAdditions().add(new Addition(name, price));
        System.out.println("New addition added successfully!");
    }

    public static void main(String[] args) {
        AdminMain adminMain = new AdminMain();
        adminMain.run();
    }
}
