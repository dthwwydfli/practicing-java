public class Order {
    private Drink drink;
    private int quantity;

    public Order(Drink drink, int quantity) {
        this.drink = drink;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return drink.getPrice() * quantity;
    }

    public void printReceipt() {
        System.out.println("--- BEAN THERE RECEIPT ---");
        System.out.println("Item: " + drink.getName());
        System.out.println("Price: £" + drink.getPrice());
        System.out.println("Qty: " + quantity);
        System.out.println("TOTAL: £" + getTotalCost());
        System.out.println("--------------------------\n");
    }

    // MAKE SURE THIS IS INSIDE THE CLASS BRACKETS
    public static void main(String[] args) {
        Drink d1 = new Drink("Latte", 3.50);
        Drink d2 = new Drink("Espresso", 2.20);

        Order o1 = new Order(d1, 2);
        Order o2 = new Order(d2, 1);

        o1.printReceipt();
        o2.printReceipt();
    }
} // This is the final bracket that closes the class