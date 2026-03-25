public class Drink {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Standard Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public static void main(String[] args) {
    // Create 2 Drinks (The Menu)
    Drink d1 = new Drink("Latte", 3.50);
    Drink d2 = new Drink("Espresso", 2.20);

    // Create 2 Orders (The Customers)
    Order o1 = new Order(d1, 2); // Someone bought 2 Lattes
    Order o2 = new Order(d2, 1); // Someone bought 1 Espresso

    // Print Receipts
    o1.printReceipt();
    o2.printReceipt();
}
}