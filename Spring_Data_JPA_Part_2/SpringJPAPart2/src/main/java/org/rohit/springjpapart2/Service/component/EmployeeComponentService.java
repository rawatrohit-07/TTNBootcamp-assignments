package org.rohit.springjpapart2.Service.component;
import org.rohit.springjpapart2.Entity.Component.EmployeeComponent;
import org.rohit.springjpapart2.Repository.Component.EmployeeComponentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeComponentService {

    private final EmployeeComponentRepository repo;

    public EmployeeComponentService(EmployeeComponentRepository repo) {
        this.repo = repo;
    }

    public EmployeeComponent save(EmployeeComponent emp) {
        return repo.save(emp);
    }

    public List<EmployeeComponent> findAll() {
        return repo.findAll();
    }
}

