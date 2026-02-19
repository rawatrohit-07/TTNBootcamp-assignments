package org.rohit.springjpapart2.Service.inheritance;

import org.rohit.springjpapart2.Entity.inheritance.singletable.VehicleST;
import org.rohit.springjpapart2.Repository.inheritance.singletable.VehicleSTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleTableService {
    private final VehicleSTRepository repo;
    public SingleTableService(VehicleSTRepository repo) { this.repo = repo; }
    public VehicleST save(VehicleST v) { return repo.save(v); }
    public List<VehicleST> findAll() { return repo.findAll(); }
}
