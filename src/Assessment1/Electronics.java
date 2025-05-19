package Assessment1;

public class Electronics extends Product {
    private String brandName;
    private int warrantyPeriod;

    public Electronics(String id, String name, double price, String brandName, int warrantyPeriod) {
        super(id, name, price, "Electronics");
        this.brandName = brandName;
        this.warrantyPeriod = warrantyPeriod;


    }
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getProductDetails() {
        return toString() + "Brand: " + brandName + "Warranty Period: " + warrantyPeriod;


    }
}
