import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Polymorphism (အဓိကအချက်)
        // List ကို 'Product' အမျိုးအစားလို့ ကြေညာထားပေမယ့်
        // တကယ်တမ်းကျတော့ 'Coffee' (Child) တွေကို ထည့်သိမ်းမှာပါ။
        ArrayList<Product> orderList = new ArrayList<>();

        System.out.println("=== ☕ မင်္ဂလာပါ Coffee Shop မှ ကြိုဆိုပါတယ် ===");

        // 2. User ဆီက Input တောင်းခြင်း (Infinite Loop)
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
                // Coffee Object အသစ်ဆောက်ပြီး List ထဲထည့်
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
                // Checkout လုပ်မယ်
                break; // Loop ကနေ ထွက်မယ်
            } else {
                System.out.println("❌ Fucking Invalid Option. Please try again.");
            }
        }

        // 3. ဘေလ်ရှင်းခြင်း (Loop through the list)
        System.out.println("\n=== သင့်ဘေလ် ===");
        double total = 0;

        for (Product p : orderList) {
            // ဒီနေရာမှာ Polymorphism အလုပ်လုပ်ပါပြီ။
            // 'p' က Product variable ဖြစ်ပေမယ့်၊ Run တဲ့အချိန်မှာ
            // Coffee Class ထဲက getDescription() ကိုပဲ အလိုလိုသိပြီး ခေါ်သွားမှာပါ။
            System.out.println("- " + p.getDescription());
            total += p.getPrice();
        }

        System.out.println("-----------------");
        System.out.println("Total: $" + total);
        System.out.println("Fuck You Bitch!");
        
        scanner.close(); // Memory ယိုစိမ့်မှု မရှိအောင် ပိတ်ပေးတာ ကောင်းပါတယ်
    }
}