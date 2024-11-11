public class Product {
    private String type;


    public Product(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                '}';
    }
}