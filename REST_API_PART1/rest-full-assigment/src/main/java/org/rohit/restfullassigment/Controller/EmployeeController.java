package org.rohit.restfullassigment.Controller;
import jakarta.validation.Valid;
import org.rohit.restfullassigment.Model.Employee;
import org.rohit.restfullassigment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /// Ques3. Implement GET http request for Employee to get list of employees.
    @GetMapping(path = "/Employee")
    public List<Employee> retrieveAllEmployee(){
        return employeeService.getEmployees();
    }
    /// Ques4. Implement GET http request using path variable top get one employee

    /*@GetMapping(path = "/Employee/{id}")
    public Employee retrieveEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeTop(id);
    }*/

    /// Ques5. Implement POST http request for Employee to create a new employee.

    @PostMapping(path = "/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    /// Ques6. Implement Exception Handling for resource not found
    @GetMapping("/Employee/{id}")
    public Employee demoGetEmployeeById(@PathVariable Integer id) {

        return employeeService.getEmployeeTop(id);
    }


    /// Ques7. Implement DELETE http request for Employee to delete employee

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
        return "Employee deleted successfully";
    }

    /// Ques8. Implement PUT http request for Employee to update employee

    @PutMapping("update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    /// Ques9. Apply validation while create a new employee using POST http Request.
    @PostMapping(path = "/AddEmployee")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
