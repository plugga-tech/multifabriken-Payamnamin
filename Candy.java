public class Candy extends Product {

    private String flavor;
    private int quantity;

    public Candy(String flavor, int quantity) {
    
        super("Godis");
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public String display() {
        return "Candy - Flavor: " + flavor + ", Quantity: " + quantity;
    }
}
