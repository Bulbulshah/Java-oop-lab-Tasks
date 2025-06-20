package lab4;

class Employee {
    public void printDetails(int id) {
        System.out.println("Employee ID: " + id);
    }

    public void printDetails(String name) {
        System.out.println("Employee Name: " + name);
    }

    public void printDetails(int id, String name) {
        System.out.println("Employee ID: " + id + ", Employee Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.printDetails(101);
        emp.printDetails("MOHSIN");
        emp.printDetails(101, "MOHSIN");
    }
}