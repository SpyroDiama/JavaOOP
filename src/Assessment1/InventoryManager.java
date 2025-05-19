package Assessment1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class InventoryManager {
    private List<Product> inventory;
    private int nextId;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
        this.nextId = 1;

        addSampleProducts();
    }

    private void addSampleProducts() {
        addProduct(new Electronics(generateId(), "Laptop", 1200, "Toshiba", 9));
        addProduct(new Electronics(generateId(), "Smartphone", 1000, "Apple", 12));
        addProduct(new Electronics(generateId(),"Computer",2500, "Alienware", 24));

        addProduct(new Groceries(generateId(), "Pear", 1.99, 15,"23/5/2025"));
        addProduct(new Groceries(generateId(), "Banana", 1.20, 1,"22/5/2025"));
        addProduct(new Groceries(generateId(), "Tomato", 0.99, 0.90,"21/5/2025"));

        addProduct(new Clothing(generateId(),"M", "Cloth",15.99, "12","T-Shirt"));
        addProduct(new Clothing(generateId(),"L", "Polyester",65.00, "231","Gloves"));
        addProduct(new Clothing(generateId(),"XS", "Leather",13.00, "5","Jacket"));


    }
    private String generateId() {
        return String.valueOf(nextId++);
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public boolean updateProduct(String id, Product updatedProduct) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId().equals(id)) {
                inventory.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }
    public boolean removeProduct(String id) {
        return inventory.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(String id) {
        return inventory.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);

    }
    public List<Product> getAllProducts() {
        return new ArrayList<>(inventory);
    }
    public List<Product> searchProductsByName(String name) {
        String searchLowerCase = name.toLowerCase();
        return inventory.stream().filter(product -> product.getName().toLowerCase().contains(searchLowerCase)).collect(Collectors.toList());
    }
    public List<Product> getProductsByCategory(String category) {
        return inventory.stream().filter(product -> product.getCategory().toLowerCase().contains(category.toLowerCase())).collect(Collectors.toList());
    }

    public int getInventorySize() {
        return inventory.size();
    }

}
