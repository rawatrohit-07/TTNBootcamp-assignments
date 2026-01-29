import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeRecord{

    private String fullName;
    private Long salary;
    private String city;

    public EmployeeRecord(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}

public class Ques9 {

    public static void main(String[] args) {

        List<EmployeeRecord> list = Arrays.asList(
                new EmployeeRecord("Rohit Rawat", 3000L, "Kashipur"),
                new EmployeeRecord("Raman Singh", 2000L, "Delhi"),
                new EmployeeRecord("Himanshu Sharma", 4000L, "Faridabad"),
                new EmployeeRecord("Kunal", 7000L, "Delhi")
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() < 5000)
                .filter(e -> "Delhi".equalsIgnoreCase(e.getCity()))
                .map(e -> e.getFullName().split(" ")[0])
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
