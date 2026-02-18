package org.rohit.springjpapart1.Controller;

import org.rohit.springjpapart1.Entity.Employee;
import org.rohit.springjpapart1.Repository.EmployeeRepository;
import org.rohit.springjpapart1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Ques 3. Perform Create Operation on Entity using Spring Data JPA

    @PostMapping("/create-user")
    public Employee createUser(@RequestBody Employee employee){
        return employeeService.save(employee);
    }


    //Ques 4. Perform Update Operation on Entity using Spring Data JPA

    @PutMapping("/update-employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,
            @RequestBody Employee employee) {

        Employee updated = employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok(updated);
    }

    //Ques 5. Perform Delete Operation on Entity using Spring Data JPA

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }


    //Ques 6. Perform Read Operation on Entity using Spring Data JPA

    // 1. Get By id
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    // 2. Get All
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }


    // Ques 7. Get the total count of the number of Employees
    @GetMapping("/count")
    public long getEmployeeCount(){
        return employeeService.countAllEmployees();
    }

    // Ques 8. Implement Pagination and Sorting on the bases of Employee Age

    @GetMapping("/employee-page")
    public ResponseEntity<Page<Employee>> getEmployeesByAge(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "asc") String sortDir) {

        Page<Employee> result = employeeService.getEmployeesPagedAndSortedByAge(page, size, sortDir);
        return ResponseEntity.ok(result);
    }


    // Ques 9. Create and use finder to find Employee by Name
    @GetMapping("/by-name")
    public ResponseEntity<List<Employee>> getEmployeesByName(@RequestParam String name) {
        return ResponseEntity.ok(employeeService.getEmployeesByName(name));
    }

    // Ques 10. Create and use finder to find Employees starting with A character
    @GetMapping("/start-with")
    public ResponseEntity<List<Employee>> getEmployeesStartingWith(@RequestParam String prefix) {
        return ResponseEntity.ok(employeeService.getEmployeesStartingWith(prefix));
    }


    //Ques 11. Create and use finder to find Employees Between the age of 28 to 32

    @GetMapping("/by-age-between")
    public List<Employee> getEmployeesByAgeBetween(@RequestParam Integer startAge, @RequestParam Integer endAge) {
        return employeeService.getEmployeesBetweenAges(startAge, endAge);
    }


}
