public class Staff extends UEmployee {
    private String jobTitle;
    
    public Staff(String title, String n, double s) {
        super(n, s);
        jobTitle = title;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void getEmployeeInfo() {
        System.out.println("\nJob Title: " + jobTitle);
        System.out.println("Name: " + super.getName());
        System.out.println("Salary: " + super.getSalary());
    }
}
