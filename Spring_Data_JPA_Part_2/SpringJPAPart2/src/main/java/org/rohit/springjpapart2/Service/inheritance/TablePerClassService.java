package org.rohit.springjpapart2.Service.inheritance;
import org.rohit.springjpapart2.Entity.inheritance.tableperclass.VehicleTPC;
import org.rohit.springjpapart2.Repository.inheritance.tableperclass.VehicleTPCRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablePerClassService {

    private final VehicleTPCRepository repo;

    public TablePerClassService(VehicleTPCRepository repo) {
        this.repo = repo;
    }

    public VehicleTPC save(VehicleTPC v) {
        return repo.save(v);
    }

    public List<VehicleTPC> findAll() {
        return repo.findAll();
    }
}
