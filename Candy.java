public class Candy extends Product {
    private String flavor;
    private String quantity;

    public Candy(String flavor, String quantity) {
    
        super("Godis");
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public String display() {
        return "Candy - Flavor: " + flavor + ", Quantity: " + quantity;
    }
}
