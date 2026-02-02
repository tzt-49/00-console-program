// Product.java
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Abstraction: Child classes must implement this
    public abstract String getDescription();
}