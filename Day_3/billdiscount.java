package Day_3;

import java.util.Scanner;

public class billdiscount {

    static void discount(double bill) {

        if (bill > 5000) {
            System.out.println("Discount = 25%");
        }
        else if (bill > 2000) {
            System.out.println("Discount = 20%");
        }
        else if (bill > 1000) {
            System.out.println("Discount = 10%");
        }
        else {
            System.out.println("No Discount");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        discount(bill);   // Function Call
    }
}
    

