package LearningCollection;

public class Product {
    int productID;
    String productName;
    double price;
    String category;
    int quantity;

    public Product(int productID, String productName, double price, String category, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + productID +
                " | Name: " + productName +
                " | Price: ₹" + price +
                " | Category: " + category +
                " | Quantity: " + quantity);
    }
}