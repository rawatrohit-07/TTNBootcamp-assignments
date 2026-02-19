package org.rohit.springjpapart2.Service;

import org.rohit.springjpapart2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    // Q1) Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    public List<Object[]> getEmployeesWithSalaryGreaterThanAvg() {
        return employeeRepository.findEmployeesWithSalaryGreaterThanAvg();
    }

    // Q2) Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    public int updateSalaryForEmployeesBelowAvg(Double newSalary) {
        return employeeRepository.updateSalaryLessThanAvg(newSalary);
    }

    // Q3) Delete employees with minimum salary
    public int deleteEmployeesWithMinSalary() {
        return employeeRepository.deleteEmployeesWithMinSalary();
    }
}
