package org.rohit.springjpapart2.Entity.inheritance.joined;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_j")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class VehicleJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    public Long getId() { return id; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
}
