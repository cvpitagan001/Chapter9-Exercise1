public class Faculty extends UEmployee {
    private String deptName;

    public Faculty(String dName, String ename, double salary) {
        super(ename, salary);
        deptName = dName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void getEmployeeInfo() {
        System.out.println("\nDepartment: " + deptName);
        System.out.println("Name: " + super.getName());
        System.out.println("Salary: " + super.getSalary());
    }
}
