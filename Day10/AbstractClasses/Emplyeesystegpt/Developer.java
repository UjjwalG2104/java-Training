package Day10.AbstractClasses.Emplyeesystegpt;

class Developer extends Employee {
    double bonus;

    Developer(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    double calculateAnnualSalary() {
        return (salary * 12) + bonus;
    }
}