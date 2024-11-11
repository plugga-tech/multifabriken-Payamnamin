public class Pipe extends Product {

    private double diameter;
    private double length;

    public Pipe(double diameter, double length){

        super("Rör");
        this.diameter = diameter;
        this.length = length;
    }

    public String display() {
        return "Pipe - Diameter: " + diameter + ", Length: " + length;
    }
}
