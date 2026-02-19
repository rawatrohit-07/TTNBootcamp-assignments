package org.rohit.springjpapart2.Controller;

import org.rohit.springjpapart2.Repository.EmployeeRepository;
import org.rohit.springjpapart2.Service.Q2EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/// Native Query:
///
/// Instructions:
/// A) Create an employeeTable table with the following fields: empId, empFirstName, empLastName, empSalary, empAge.
///
/// B) Create an Employee entity having following fields: id, firstName, lastName, salary, age which maps to the table columns given in above.

@RestController
@RequestMapping("/employees")
public class Q2EmployeeController {

    @Autowired
    private Q2EmployeeService employeeService;

    //Q1. Display the id, first name, age of all employees where last name ends with "singh"

    @GetMapping("/lastname-ends-with")
    public List<Map<String, Object>> getEmployeesByLastNameSuffix(@RequestParam String suffix) {

        List<Object[]> result = employeeService.getEmployeesEndingWith(suffix);
        List<Map<String, Object>> response = new ArrayList<>();

        for (Object[] row : result) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", row[0]);
            map.put("firstName", row[1]);
            map.put("age", row[2]);
            response.add(map);
        }
        return response;
    }

    //Q2. Delete all employees with age greater than 45(Should be passed as a parameter)

    @DeleteMapping("/delete-age-greater-than")
    public String deleteEmployeesAboveAge(@RequestParam Integer age) {
        int deleted = employeeService.deleteEmployeesAboveAge(age);
        return deleted + " employees deleted.";
    }
}

