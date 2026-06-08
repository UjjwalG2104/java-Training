package Day7;

public class EcommerceCatalog {

    public static void main(String[] args) {

        String product[] = {"Laptop", "Mouse", "Keyboard", "Monitor", "Phone"};
        double price[] = {50000, 500, 1500, 12000, 30000};

        // 1. Display Products
        System.out.println("Product Catalog:");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i] + " = " + price[i]);
        }

        // 2. Most Expensive Product
        int maxIndex = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("\nMost Expensive Product:");
        System.out.println(product[maxIndex] + " = " + price[maxIndex]);

        // 3. Cheapest Product
        int minIndex = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] < price[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("\nCheapest Product:");
        System.out.println(product[minIndex] + " = " + price[minIndex]);

        // 4. Search Product
        String search = "Mouse";
        boolean found = false;

        for (int i = 0; i < product.length; i++) {
            if (product[i].equalsIgnoreCase(search)) {
                found = true;
                System.out.println("\nProduct Found: " + product[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("\nProduct Not Found");
        }

        // 5. Total Inventory Value
        double total = 0;
        for (double p : price) {
            total += p;
        }

        System.out.println("\nTotal Inventory Value = " + total);

        // 6. Products containing 'a'
        System.out.println("\nProducts containing 'a':");

        for (String p : product) {
            if (p.toLowerCase().contains("a")) {
                System.out.println(p);
            }
        }
    }
}