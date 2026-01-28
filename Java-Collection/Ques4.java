import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {

    private String name;
    private int age;
    private String role;

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(role, other.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, role);
    }
    @Override
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", Role: " + role;
    }
}
public class Ques4 {
    public static void main(String[] args) {

        Map<Employee, Double> employeeSalaryMap = new HashMap<>();

        Employee emp1 = new Employee("Rohit", 25, "Developer");
        Employee emp2 = new Employee("Jashdeep", 23, "Quality Engineer");
        Employee emp3 = new Employee("Raman", 28, "Data Analyst");

        employeeSalaryMap.put(emp1, 80000.00);
        employeeSalaryMap.put(emp2, 50000.00);
        employeeSalaryMap.put(emp3, 60000.00);

        System.out.println("Employee Salary Details:\n");

        for (Map.Entry<Employee, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println(
                    entry.getKey() +
                            " | Monthly Salary:" +
                            entry.getValue()
            );
        }
    }
}
