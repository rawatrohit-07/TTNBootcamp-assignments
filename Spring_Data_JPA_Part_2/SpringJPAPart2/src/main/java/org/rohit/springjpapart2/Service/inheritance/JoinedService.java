package org.rohit.springjpapart2.Service.inheritance;
import org.rohit.springjpapart2.Entity.inheritance.joined.VehicleJ;
import org.rohit.springjpapart2.Repository.inheritance.joined.VehicleJRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinedService {

    private final VehicleJRepository repo;

    public JoinedService(VehicleJRepository repo) {
        this.repo = repo;
    }

    public VehicleJ save(VehicleJ v) {
        return repo.save(v);
    }

    public List<VehicleJ> findAll() {
        return repo.findAll();
    }
}
