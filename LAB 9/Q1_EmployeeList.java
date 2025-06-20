import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Q1_EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ali", 50000));
        employees.add(new Employee(2, "Sara", 75000));
        employees.add(new Employee(3, "Zain", 60000));

        Employee highest = employees.get(0);
        for (Employee e : employees) {
            if (e.salary > highest.salary) {
                highest = e;
            }
        }

        System.out.println("Highest Paid Employee: " + highest.name + ", Salary: " + highest.salary);
    }
}
