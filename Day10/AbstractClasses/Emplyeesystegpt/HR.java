package Day10.AbstractClasses.Emplyeesystegpt;

class HR extends Employee {
    double allowance;

    HR(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    double calculateAnnualSalary() {
        return (salary * 12) + allowance;
    }
}