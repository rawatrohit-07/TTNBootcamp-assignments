package org.rohit.springjpapart2.Repository.inheritance.joined;

import org.rohit.springjpapart2.Entity.inheritance.joined.VehicleJ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleJRepository extends JpaRepository<VehicleJ, Long> {}