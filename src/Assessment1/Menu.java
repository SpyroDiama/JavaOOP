package Assessment1;

import java.util.Scanner;
import java.util.List;

public class Menu {
    private final InventoryManager menu;
    private final Scanner in = new Scanner(System.in);

    public Menu(InventoryManager manage) {
        this.menu = manage;
    }


    public void run() {
        while (true) {
            System.out.print("""
                1:  View all products
                2: Search products
                3: Add product
                4: Update product
                5: Remove product
                0: Exit
                Choice:""");

            switch (in.nextLine().trim()) {
                case "1" -> show(menu.getAllProducts());

                case "2" -> {
                    System.out.print("Name: ");
                    show(menu.searchProductsByName(in.nextLine()));
                }
                case "3" -> addProduct();

                case "4" -> updateProduct();

                case "5" -> removeProduct();

                case "0" -> { System.out.println("Exiting...!");
                    return;
                }

                default  -> System.out.println("Try different input.");
            }
        }
    }

    private void show(List<Product> list) {
        if (list.isEmpty()) System.out.println("No products.");

        else list.forEach(p -> System.out.println(p.getProductDetails()));
    }

    private void addProduct() {
        System.out.println();
    }

    private void updateProduct() {
        System.out.println();
    }

    private void removeProduct() {
        System.out.println();
    }

}
