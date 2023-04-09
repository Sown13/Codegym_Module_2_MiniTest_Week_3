public class FullTimeEmployee extends Employee{
    private double bonus;
    private double fines;
    private double fixedSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String employeeID, String name, int age, int phoneNumber, String email, Address address, double bonus, double fines, double fixedSalary) {
        super(employeeID, name, age, phoneNumber, email, address);
        this.bonus = bonus;
        this.fines = fines;
        this.fixedSalary = fixedSalary;
    }

    public FullTimeEmployee(String employeeID, String name, int age, int phoneNumber, String email, double bonus, double fines, double fixedSalary) {
        super(employeeID, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fines = fines;
        this.fixedSalary = fixedSalary;
    }

    @Override
    double getNetSalary() {
        return fixedSalary + bonus - fines;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + super.toString() +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", fixedSalary=" + fixedSalary +
                '}' + "\n";
    }
}
