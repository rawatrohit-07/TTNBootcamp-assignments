package org.rohit.springjpapart2.Repository.inheritance.singletable;

import org.rohit.springjpapart2.Entity.inheritance.singletable.VehicleST;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleSTRepository extends JpaRepository<VehicleST, Long> {}
