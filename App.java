import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    private static List<Car> cars = new ArrayList<>();
    private static List<Candy> candies = new ArrayList<>();
    private static List<Pipe> pipes = new ArrayList<>();
    private static List<OatMilk> oatmilks = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // variabel for loop control


        while (running) {
            System.out.println("Välj en produkt att beställa :");

            System.out.println("1. Bilar");
            System.out.println("2. Godis");
            System.out.println("3. Rör");
            System.out.println("4. Havremjölk");

            System.out.println("5. Lista alla produkter");
            System.out.println("6. Avsluta programmet");

            int choice = scanner.nextInt(); // Get teh users choice 
            scanner.nextLine(); // for read the newint after newline


            switch (choice) {
                case 1:
                    //Order car
                    System.out.println("Ange registeringsnummer: ");
                    String registrationNumber = scanner.nextLine();
                    System.out.println("Ange färg: ");
                    String color = scanner.nextLine();
                    System.out.println("Ange bilmärke: ");
                    String brand = scanner.nextLine();
                    cars.add(new Car(registrationNumber, color, brand));
                    
                    break;
                case 2:
                    //Order candies
                    System.out.println("Ange smak: ");
                    String flavor = scanner.nextLine();
                    System.out.println("Ange antal: ");
                    int quantity = scanner.nextInt();
                    candies.add(new Candy(flavor, quantity));

                    break;

                case 3:
                 
                 System.out.println("Aneg diameter: ");
                 double diameter = scanner.nextDouble();
                 System.out.println("Ange längd: ");
                 double length = scanner.nextDouble();
                 pipes.add(new Pipe(diameter, length));

                 break;
                
                case 4:
                
                System.out.println("Ange fetthalt: ");
                double fatContent = scanner.nextDouble();
                System.out.println("Ange litermängd: ");
                double volume =scanner.nextDouble();
                oatmilks.add(new OatMilk(fatContent, volume));

                break;

                case 5:
                //List the all products
                System.out.println("Beställda bilar : ");
                for (Car car : cars) {
                    System.out.println(car.display());
                }
                System.out.println("Beställda godis : ");
                for (Candy candy : candies) {
                    System.out.println(candy.display());
                }
                System.out.println("Bäställda rör :");
                for (Pipe pipe : pipes) {
                    System.out.println(pipe.display());
                }
                System.out.println("Bäställda havremjölk :");
                for (OatMilk oatMilk : oatmilks) {
                    System.out.println(oatMilk.display());
                }
                break;

                case 6: 
                running = false;
                break;

                default:
                System.out.println("Ogiltigt val, försök igen.");
                    
            }
        }

        scanner.close();
    }

}
