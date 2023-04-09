import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager {
    List<Employee> employeeList = new ArrayList<>();

    public double getAverageSalary(){
        double sum = 0;
        for (Employee employee : employeeList){
            sum += employee.getNetSalary();
        }
        return sum / employeeList.size();
    }

    public double getTotalPartTimeSalary(){
        double sum = 0;
        for (Employee employee : employeeList){
            if (employee instanceof PartTimeEmployee){
                sum += employee.getNetSalary();
            }
        }
        return sum;
    }
    public double getTotalFullTimeSalary(){
        double sum = 0;
        for (Employee employee : employeeList){
            if (employee instanceof FullTimeEmployee){
                sum += employee.getNetSalary();
            }
        }
        return sum;
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void showBelowAverageFullTime(){
        for (Employee employee : employeeList){
            if (employee instanceof FullTimeEmployee){
                if (employee.getNetSalary() < getAverageSalary()){
                    System.out.println("Net salary: " + employee.getNetSalary() + " " + employee);
                }
            }
        }
    }
    public void sortFullTimeEmployee(){
        employeeList.sort(Comparator.comparing(Employee::getNetSalary));
        for (Employee employee : employeeList){
            if (employee instanceof  FullTimeEmployee){
                System.out.println("net salary: " + employee.getNetSalary() + " " + employee);
            }
        }
    }
    public void sortByName(){
        employeeList.sort(Comparator.comparing(Employee::getName));
    }
    public void sortByID(){
        employeeList.sort(Comparator.comparing(Employee::getEmployeeID));
    }
    public void sortByAge(){
        employeeList.sort(Comparator.comparing(Employee::getAge));
    }
    public void displayEmployeeList(){
        System.out.println(employeeList);
    }
}
