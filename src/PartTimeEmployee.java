public class PartTimeEmployee extends Employee{
    private double housrOfWork;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String employeeID, String name, int age, int phoneNumber, String email, Address address, double housrOfWork) {
        super(employeeID, name, age, phoneNumber, email, address);
        this.housrOfWork = housrOfWork;
    }

    public PartTimeEmployee(String employeeID, String name, int age, int phoneNumber, String email, double housrOfWork) {
        super(employeeID, name, age, phoneNumber, email);
        this.housrOfWork = housrOfWork;
    }

    @Override
    double getNetSalary() {
        return housrOfWork * 100_000;
    }

    public double getHousrOfWork() {
        return housrOfWork;
    }

    public void setHousrOfWork(double housrOfWork) {
        this.housrOfWork = housrOfWork;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + super.toString() +
                "housrOfWork=" + housrOfWork +
                '}' + "\n";
    }
}
