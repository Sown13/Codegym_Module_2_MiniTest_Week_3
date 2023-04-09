import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeList = new EmployeeManager();
        Employee e1 = new FullTimeEmployee("Fulltime", "Son", 30, 123456789, "son@mail", 100000, 0, 1000000);
        Employee e2 = new FullTimeEmployee("Fulltime", "Nam", 40, 123456789, "nam@mail", 50000, 50000, 700000);
        Employee e3 = new FullTimeEmployee("Fulltime", "Giang", 40, 123456789, "giang@mail", 200000, 0, 2000000);
        Employee e4 = new PartTimeEmployee("Parttime", "Thi", 25, 123456789, "thi@mail", 10);
        Employee e5 = new PartTimeEmployee("Parttime", "Cong", 35, 123456789, "cong@mail", 40);
        Employee e6 = new PartTimeEmployee("Parttime", "Hai", 40, 123456789, "hai@mail", 5);
        Employee e7 = new PartTimeEmployee("Parttime", "Chung", 15, 123456789, "chung@mail", 5);
        Employee e8 = new PartTimeEmployee("Parttime", "Dung", 25, 123456789, "dung@mail", 20);
        Employee e9 = new FullTimeEmployee("Fulltime", "Hung", 50, 123456789, "hung@mail", 0, 100000, 500000);
        Employee e10 = new FullTimeEmployee("Fulltime", "Tuan", 20, 123456789, "tuan@mail", 50000, 0, 1000000);
        employeeList.addEmployee(e1);
        employeeList.addEmployee(e2);
        employeeList.addEmployee(e3);
        employeeList.addEmployee(e4);
        employeeList.addEmployee(e5);
        employeeList.addEmployee(e6);
        employeeList.addEmployee(e7);
        employeeList.addEmployee(e8);
        employeeList.addEmployee(e9);
        employeeList.addEmployee(e10);
        employeeList.displayEmployeeList();
        System.out.println("6/ Average salary = " + employeeList.getAverageSalary());
        System.out.println("7/ Fulltime Employee that have salary below average: " );
        employeeList.showBelowAverageFullTime();
        System.out.println("8/ Total part time salary = " + employeeList.getTotalPartTimeSalary());
        System.out.println("9/ Sort full time employee by their salary: ");
        employeeList.sortFullTimeEmployee();
    }
}



