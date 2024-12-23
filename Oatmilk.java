public class OatMilk extends Product {

    private double fatContent;
    private double volume;

    public OatMilk(double fatContent, double volume){
    
        super("Havremjölk");

        this.fatContent = fatContent;
        this.volume = volume;
    }

    public String display() {
        return "OatMilk - Fat Content: " + fatContent + ", Volume: " + volume;
    }
    
}
