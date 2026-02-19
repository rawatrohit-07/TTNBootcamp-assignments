package org.rohit.springjpapart2.Controller.component;

import org.rohit.springjpapart2.Entity.Component.EmployeeComponent;
import org.rohit.springjpapart2.Service.component.EmployeeComponentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/component/employees")
public class EmployeeComponentController {

    private final EmployeeComponentService service;

    public EmployeeComponentController(EmployeeComponentService service) {
        this.service = service;
    }

    @PostMapping
    public EmployeeComponent create(@RequestBody EmployeeComponent emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<EmployeeComponent> getAll() {
        return service.findAll();
    }
}

