package Assessment1;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        new Menu(manager).run();
    }
}
