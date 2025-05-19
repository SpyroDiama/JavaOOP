package Assessment1;

public class Groceries extends Product{
    private double weight;
    private String expirationDate;

    public Groceries(String id, String name, double price,
                     double weight, String expirationDate) {
        super(id, name, price, "Grocery");
        this.weight = weight;
        this.expirationDate = expirationDate;
    }


    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getExpirationDate() { return expirationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    @Override
    public String getProductDetails() {
        return toString() + "Weight: "  +  weight + " kg" + "Expiration Date: "  + expirationDate;

    }
}
