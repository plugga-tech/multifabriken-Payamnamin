public class Car extends Product {

    private String registrationNumber;
    private String color;
    private String brand;

    public Car(String registrationNumber, String color, String brand) {

        super("Bil"); // Shows the variety of product
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.brand = brand;
    }
    // Method for showing the information of product 
    public String display() {
        return "Car - Registration Number: " + registrationNumber + ", Color: " + color + ", Brand: " + brand;
    }
}
