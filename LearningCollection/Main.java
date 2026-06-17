package LearningCollection;

public class Main {

    public static void main(String[] args) {

        Ecommerce cart = new Ecommerce();

        // Add Products
        cart.addProduct(new Product(101, "Laptop", 50000, "Electronics", 1));
        cart.addProduct(new Product(102, "Mouse", 500, "Electronics", 2));
        cart.addProduct(new Product(101, "Laptop", 50000, "Electronics", 1)); // Duplicate Allowed

        // Display Products
        cart.displayProducts();

        // Search Product
        cart.searchProduct(102);

        // Update Product
        cart.updateProduct(102, "Wireless Mouse", 800, "Electronics");

        // Sort Products Alphabetically
        cart.sortProducts();

        // Display After Sorting
        cart.displayProducts();

        // Calculate Bill
        cart.calculateBill();
    }
}