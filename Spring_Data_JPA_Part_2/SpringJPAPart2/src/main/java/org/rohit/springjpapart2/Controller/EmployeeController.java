package org.rohit.springjpapart2.Controller;

import org.rohit.springjpapart2.Repository.EmployeeRepository;
import org.rohit.springjpapart2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    // Q1) Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @GetMapping("/above-average")
    public List<Map<String, String>> getEmployeesAboveAvgSalary() {

        List<Object[]> result = employeeService.getEmployeesWithSalaryGreaterThanAvg();
        List<Map<String, String>> response = new ArrayList<>();

        for (Object[] row : result) {
            Map<String, String> map = new HashMap<>();
            map.put("firstName", (String) row[0]);
            map.put("lastName", (String) row[1]);
            response.add(map);
        }
        return response;
    }

    // Q2) Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @PutMapping("/update-salary")
    public String updateSalary(@RequestParam Double newSalary) {
        int updated = employeeService.updateSalaryForEmployeesBelowAvg(newSalary);
        return updated + " employees updated.";
    }

    // Q3) Delete employees with minimum salary
    @DeleteMapping("/delete-min-salary")
    public String deleteMinSalaryEmployees() {
        int deleted = employeeService.deleteEmployeesWithMinSalary();
        return deleted + " employees deleted.";
    }

}
