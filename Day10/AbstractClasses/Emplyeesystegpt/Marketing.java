package Day10.AbstractClasses.Emplyeesystegpt;

class Marketing extends Employee {
    double incentive;

    Marketing(int id, String name, double salary, double incentive) {
        super(id, name, salary);
        this.incentive = incentive;
    }

    double calculateAnnualSalary() {
        return (salary * 12) + incentive;
    }
}