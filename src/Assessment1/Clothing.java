package Assessment1;

public class Clothing extends Product{
    private String color;
    private String size;
    private String material;

    public Clothing(String color, String size, String material, double price, String id, String name) {
        super(id, name, price, "Clothing");
        this.color = color;
        this.size = size;
        this.material = material;

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getProductDetails() {
        return toString() + "Color: " + color + "Size: " + size + "Material: " + material;

    }


}
