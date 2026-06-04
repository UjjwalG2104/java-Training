package Day_3;

import java.util.Scanner;

public class Taxi {
    

    static int Taxi(String type, int km) {

        int fare = 0;

        if (type.equals("bike")) {
            fare = km * 10;
        }
        else if (type.equals("car")) {
            fare = km * 25;
        }
        else if (type.equals("rental")) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Rental Hours: ");
            int hrs = sc.nextInt();

            if (hrs == 1) {
                fare = km * 25;
            }
            else if (hrs == 2) {
                fare = km * 30;
            }
            else {
                fare = km * 40;
            }
        }

        return fare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Taxi Type (bike/car/rental): ");
        String type = sc.next();

        System.out.print("Enter KM: ");
        int km = sc.nextInt();

        int taxifare = Taxi(type, km);

        System.out.println("Taxi Fare = " + taxifare);
    }
}
}
