public abstract class Employee {
    private static int hidden = 1000;
    private String employeeID;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;

    private Address address;

    public Employee() {
        hidden++;
    }

    public Employee(String employeeID, String name, int age, int phoneNumber, String email) {
        hidden++;
        this.employeeID = employeeID + hidden;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Employee(String employeeID, String name, int age, int phoneNumber, String email, Address address) {
        hidden++;
        this.employeeID = employeeID + hidden;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    abstract double getNetSalary();

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
