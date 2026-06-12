package Day10.AbstractClasses.Emplyeesystegpt;

public class PayrollSystem {
    public static void main(String[] args) {

        Employee emp1 = new Developer(101, "Rahul", 50000, 100000);
        Employee emp2 = new HR(102, "Priya", 40000, 50000);
        Employee emp3 = new Marketing(103, "Amit", 45000, 75000);

        System.out.println("Developer Details:");
        emp1.display();

        System.out.println("\nHR Details:");
        emp2.display();

        System.out.println("\nMarketing Details:");
        emp3.display();
    }
}