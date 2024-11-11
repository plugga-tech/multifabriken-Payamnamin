import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    private static List<Car> cars = new ArrayList<>(null);
    private static List<Candy> candy = new ArrayList<>(null);
    private static List<Pipe> pipe = new ArrayList<>(null);
    private static List<OatMilk> oatmilks = new ArrayList<>(null);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // variabel for loop control


        while (running) {
            System.out.println("Välj en produkt att beställa");

            System.out.println("1. Bilar");
            System.out.println("2. Godis");
            System.out.println("3. Rör");
            System.out.println("4. Havremjölk");

            System.out.println("5. Lista alla produkter");
            System.out.println("6. Avsluta programmet");

            int choice = scanner.nextInt(); // Get teh users choice 
            scanner.nextLine(); // for read the newint after newline
        }
    }

}
