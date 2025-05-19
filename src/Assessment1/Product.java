package Assessment1;

abstract class Product {
    private String name;
    private String category;
    private double price;
    private String id;

    public Product(String name, String category, double price, String id) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.id = id;

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public abstract String getProductDetails();

    @Override
    public String toString() {
        return "Product ID: " + id + " Name: " + name + " Category: " + category + " Price: " + price;

    }
}
