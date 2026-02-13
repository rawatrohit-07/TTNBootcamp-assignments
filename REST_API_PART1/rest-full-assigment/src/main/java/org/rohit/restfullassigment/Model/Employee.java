
/// Ques2. Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

package org.rohit.restfullassigment.Model;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Employee {

    @NotNull(message = "Id cannot be null")
    @Positive(message = "Id must be positive")
    private Integer id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Min(value = 18, message = "Age must be at least 18")
    private Integer age;

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
