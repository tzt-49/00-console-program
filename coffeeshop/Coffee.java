// Coffee.java
public class Coffee extends Product {
    private String type; // ဥပမာ - Hot, Iced, Frappe

    public Coffee(String name, double price, String type) {
        // 1. Parent (Product) ရဲ့ Constructor ကို Data လှမ်းပို့တာပါ
        super(name, price);
        this.type = type;
    }

    // 2. Polymorphism: Product က မှာထားတဲ့အတိုင်း getDescription ကို ပြန်ရေးပေးတာပါ
    @Override
    public String getDescription() {
        return getName() + " (" + type + ") - $" + getPrice();
    }
}