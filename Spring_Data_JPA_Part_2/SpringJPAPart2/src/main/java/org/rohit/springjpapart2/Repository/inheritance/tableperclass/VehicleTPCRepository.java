package org.rohit.springjpapart2.Repository.inheritance.tableperclass;

import org.rohit.springjpapart2.Entity.inheritance.tableperclass.VehicleTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTPCRepository extends JpaRepository<VehicleTPC, Long> {}