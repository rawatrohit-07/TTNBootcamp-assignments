package org.rohit.springjpapart2.Entity.inheritance.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_j")
public class CarJ extends VehicleJ {
    private int doors;
    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }
}

