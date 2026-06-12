package Day10.AbstractClasses.Emplyeesystegpt;

public abstract class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateAnnualSalary();

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}