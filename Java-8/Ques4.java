
@FunctionalInterface
interface EmployeeFactory {
    Employee create(String name, int id);
}

class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

public class Ques4 {

    public static void main(String[] args) {

        EmployeeFactory factory = Employee::new;

        Employee emp1 = factory.create("Rohit Rawat", 107);

        emp1.showDetails();
    }
}
