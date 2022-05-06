import java.util.Scanner;

public class App {

    static Scanner get = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.menu(app);
    }

    public void menu(App app) {
        System.out.println("Add Employee");
        System.out.println("[1] Faculty");
        System.out.println("[2] Staff");
        System.out.println("[3] Exit");
        System.out.print("Option: ");
        int opt = get.nextInt();

        if(opt == 1 || opt == 2) {
            clrscr();
            app.addEmployee(opt, app);
        } else {
            System.exit(0);;
        }
    }

    public void addEmployee(int opt, App app) {
        System.out.print("Enter department/jobtitle name: ");
        String deptOrJobTitle = get.next();
        System.out.print("Enter employee name: ");
        String name = get.next();
        System.out.print("Enter salary: ");
        double salary = get.nextDouble();

        if(opt == 1) {
            UEmployee faculty = new Faculty(deptOrJobTitle, name, salary);
            faculty.getEmployeeInfo();
        } else if(opt == 2) {
            UEmployee staff = new Staff(deptOrJobTitle, name, salary);
            staff.getEmployeeInfo();
        }
    }

    public static void clrscr() {
        System.out.println("\033[H\033[2J");
    }
}
