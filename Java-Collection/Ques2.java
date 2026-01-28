import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 implements Comparable<Employee1> {
    Double age;
    Double salary;
    String name;

    public Employee1(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee1 e1) {
        String[] first = this.name.split(" ");
        String[] second = e1.name.split(" ");

        int fnCompare = first[0].compareToIgnoreCase(second[0]);

        if (fnCompare != 0) {
            return fnCompare;
        }
        return first[1].compareToIgnoreCase(second[1]);
    }

    @Override
    public String toString() {
        return name + " , age: " + age + " , salary: " + salary;
    }
}

class SalaryCompare implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.salary.compareTo(e2.salary);
    }
}

public class Ques2 {

    public static void main(String[] args) {

        List<Employee1> emp = new ArrayList<>();

        emp.add(new Employee1(25.00, 15000.00, "Rohit Rawat"));
        emp.add(new Employee1(22.00, 22000.00, "Lakshay Papnoi"));
        emp.add(new Employee1(28.00, 15800.00, "Raman Singh"));

        Collections.sort(emp);
        System.out.println("Sorted by name:");
        for (Employee1 e : emp) {
            System.out.println(e);
        }

        Collections.sort(emp, new SalaryCompare());
        System.out.println("\nSorted by salary:");
        for (Employee1 e : emp) {
            System.out.println(e);
        }
    }
}
