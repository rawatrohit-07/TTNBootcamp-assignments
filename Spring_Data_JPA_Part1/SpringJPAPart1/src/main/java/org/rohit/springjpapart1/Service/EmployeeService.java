package org.rohit.springjpapart1.Service;

import org.rohit.springjpapart1.Entity.Employee;
import org.rohit.springjpapart1.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Ques 3. Perform Create Operation on Entity using Spring Data JPA
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }


    //Ques 4. Perform Update Operation on Entity using Spring Data JPA

    public Employee updateEmployee(Long id, Employee employee){
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));

        existing.setName(employee.getName());
        existing.setAge(employee.getAge());
        existing.setLocation(employee.getLocation());

        return employeeRepository.save(existing);
    }


    //Ques 5. Perform Delete Operation on Entity using Spring Data JPA

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }


    //Ques 6. Perform Read Operation on Entity using Spring Data JPA

    // 1. Read with id
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    // 2. Read All
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


    // Ques 7. Get the total count of the number of Employees
    public long countAllEmployees(){
        return employeeRepository.count();
    }


    // Ques 8. Implement Pagination and Sorting on the bases of Employee Age

    public Page<Employee> getEmployeesPagedAndSortedByAge(int page, int size, String direction) {
        Sort sort = "desc".equalsIgnoreCase(direction) ? Sort.by("age").descending() : Sort.by("age").ascending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }

    // Ques 9. Create and use finder to find Employee by Name

    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }


    // Ques 10. Create and use finder to find Employees starting with A character

    public List<Employee> getEmployeesStartingWith(String prefix) {
        return employeeRepository.findByNameStartingWith(prefix);
    }

    //Ques 11. Create and use finder to find Employees Between the age of 28 to 32
    public List<Employee> getEmployeesBetweenAges(int startAge, int endAge) {
        return employeeRepository.findByAgeBetween(startAge, endAge);
    }

}
