package Day7;

import java.util.Scanner;

public class EmployeeOperations {

    static String[] employees = {
        "Rahul Sharma",
        "Amit Patil",
        "Priya Deshmukh",
        "Sneha Joshi",
        "Rohan Kulkarni",
        "Neha Pawar"
    };

    // 1. Search Employee by First Name
    static void searchByFirstName(String firstName) {
        boolean found = false;

        for (String emp : employees) {
            String[] parts = emp.split(" ");
            if (parts[0].equalsIgnoreCase(firstName)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Mil Gya Majdoor");
        else
            System.out.println("Bhag Gya Yahan Se");
    }

    // 2. Search Employee by Surname
    static void searchBySurname(String surname) {
        boolean found = false;

        for (String emp : employees) {
            String[] parts = emp.split(" ");
            if (parts[1].equalsIgnoreCase(surname)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Mil Gya Majdoor");
        else
            System.out.println("Bhag Gya Yahan Se");
    }

    // 3. Count Total Employees
    static void countEmployees() {
        System.out.println("Total Employees = " + employees.length);
    }

    // 4. Find Employee with Longest Name
    static void longestName() {
        String longest = employees[0];

        for (String emp : employees) {
            if (emp.length() > longest.length()) {
                longest = emp;
            }
        }

        System.out.println("Employee with Longest Name: " + longest);
    }

    // 5. Convert All Names to Uppercase
    static void convertToUpperCase() {
        System.out.println("Employee Names in Uppercase:");

        for (String emp : employees) {
            System.out.println(emp.toUpperCase());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Search By First Name");
        System.out.println("2. Search By Surname");
        System.out.println("3. Count Employees");
        System.out.println("4. Longest Name");
        System.out.println("5. Convert To Uppercase");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter First Name: ");
                String firstName = sc.nextLine();
                searchByFirstName(firstName);
                break;

            case 2:
                System.out.print("Enter Surname: ");
                String surname = sc.nextLine();
                searchBySurname(surname);
                break;

            case 3:
                countEmployees();
                break;

            case 4:
                longestName();
                break;

            case 5:
                convertToUpperCase();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
    

