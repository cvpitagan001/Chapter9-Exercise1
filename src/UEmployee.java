public class UEmployee {
    private String name;
    private double salary;

    public UEmployee(String n, double s) {
        name = n;
        salary = s;
    }

    public void getEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
