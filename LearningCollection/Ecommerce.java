package LearningCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ecommerce {

    ArrayList<Product> products = new ArrayList<>();

    // Add Product (Duplicate allowed)
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product Added Successfully!");
    }

    // Update Product
    public void updateProduct(int id, String name, double price, String category) {
        for (Product p : products) {
            if (p.productID == id) {
                p.productName = name;
                p.price = price;
                p.category = category;
                System.out.println("Product Updated Successfully!");
                return;
            }
        }
        System.out.println("Product Not Found!");
    }

    // Search Product
    public void searchProduct(int id) {
        for (Product p : products) {
            if (p.productID == id) {
                System.out.println("Product Found:");
                p.display();
                return;
            }
        }
        System.out.println("Product Not Found!");
    }

    // Display All Products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No Products Available!");
            return;
        }

        System.out.println("\nProduct List:");
        for (Product p : products) {
            p.display();
        }
    }

    // Sort Products Alphabetically
    public void sortProducts() {
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.productName.compareToIgnoreCase(p2.productName);
            }
        });

        System.out.println("Products Sorted Alphabetically!");
    }

    // Calculate Total Bill
    public void calculateBill() {
        double total = 0;

        for (Product p : products) {
            total += p.price * p.quantity;
        }

        System.out.println("Total Bill Amount = ₹" + total);
    }
}