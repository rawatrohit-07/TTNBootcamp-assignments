package org.rohit.springjpapart2.Service;

import org.rohit.springjpapart2.Repository.Q2EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/// Native Query:
///
/// Instructions:
/// A) Create an employeeTable table with the following fields: empId, empFirstName, empLastName, empSalary, empAge.
///
/// B) Create an Employee entity having following fields: id, firstName, lastName, salary, age which maps to the table columns given in above.

@Service
public class Q2EmployeeService {

   @Autowired
   private Q2EmployeeRepository employeeRepository;


   //Q1. Display the id, first name, age of all employees where last name ends with "singh"

    public List<Object[]> getEmployeesEndingWith(String suffix) {
        return employeeRepository.findEmployeesByLastNameEndingWith(suffix);
    }

    //Q2. Delete all employees with age greater than 45(Should be passed as a parameter)
    public int deleteEmployeesAboveAge(Integer age) {
        return employeeRepository.deleteEmployeesWithAgeGreaterThan(age);
    }
}
