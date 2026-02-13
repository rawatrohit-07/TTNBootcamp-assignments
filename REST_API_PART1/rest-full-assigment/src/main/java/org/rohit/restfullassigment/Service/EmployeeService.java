package org.rohit.restfullassigment.Service;

import org.rohit.restfullassigment.Exception.ResourceNotFoundException;
import org.rohit.restfullassigment.Model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(1,"Rohit Rawat",24));
        employees.add(new Employee(2,"Himanshu Sharma",22));
        employees.add(new Employee(3,"Ishmeet",23));
    }

    /// Ques3. Implement GET http request for Employee to get list of employees.
    public List<Employee> getEmployees() {
        return employees;
    }


    /// Ques4. Implement GET http request using path variable top get one employee

    /*public Employee getEmployeeTop(Integer id){

       /// one logic is this but here the problem is that i have to then handle the null later
        *//*for(Employee employee: employees){
            if(employee.getId().equals(id)){
                return employee;
            }
            return null;
        }*//*

        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }
*/

    /// Ques5. Implement POST http request for Employee to create a new employee.

    public Employee saveEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }


    /// Ques6. Implement Exception Handling for resource not found

    public Employee getEmployeeTop(Integer id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee not found with id: " + id)
                );
    }

    // Ques7. Implement DELETE http request for Employee to delete employee
    public void deleteById(int id) {

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return;
            }
        }
        throw new ResourceNotFoundException("Employee not found with id: " + id);
    }

    /// Ques8. Implement PUT http request for Employee to update employee

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(updatedEmployee.getName());
                emp.setAge(updatedEmployee.getAge());
                return emp;
            }
        }
        throw new ResourceNotFoundException("Employee not found with id: " + id);
    }



}
