class Employee {

    public static void employeeName() {
        System.out.println("Employee Name: Soni");
    }

    public static void employeeId() {
        System.out.println("Employee ID: 101");
    }

    public static void employeeSalary() {
        System.out.println("Employee Salary: 30000");
    }
}
class Company {

    public static void main(String[] args) {

        Employee.employeeName();
        Employee.employeeId();
        Employee.employeeSalary();

    }
}