import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> orderList = new ArrayList<>();

        System.out.println("=== ☕ မင်္ဂလာပါ Coffee Shop မှ ကြိုဆိုပါတယ် ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Espresso (Hot) - $2.5");
            System.out.println("2. Latte (Iced) - $3.5");
            System.out.println("3. Burmese Tea (Hot) - $4.5");
            System.out.println("4. Green Tea (Iced) - $4.0");     
            System.out.println(" Choose an option (1-4): ");
            System.out.println("5. Bill (Checkout)");

            int choice = scanner.nextInt();

            if (choice == 1) {
                orderList.add(new Coffee("Espresso", 2.5, "Hot"));
                System.out.println(" Espresso Yort!");
            } else if (choice == 2) {
                orderList.add(new Coffee("Latte", 3.5, "Iced"));
                System.out.println(" LatteYort!");
            } else if (choice == 3) {
                orderList.add(new Coffee("Burmese Tea", 4.5, "Hot"));
                System.out.println(" Burmese Tea Yort!");
            } else if (choice == 4) {
                orderList.add(new Coffee("Green Tea", 4.0, "Iced"));
                System.out.println(" Green Tea Yort!");
            } else if (choice == 5) {
                break; 
            } else {
                System.out.println("❌ Fucking Invalid Option. Please try again.");
            }
        }

        System.out.println("\n=== သင့်ဘေလ် ===");
        double total = 0;

        for (Product p : orderList) {
            System.out.println("- " + p.getDescription());
            total += p.getPrice();
        }

        System.out.println("-----------------");
        System.out.println("Total: $" + total);
        System.out.println("Fuck You Bitch!");
        
        scanner.close(); 
    }
}