package org.rohit.springjpapart2.Entity.inheritance.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_tpc")
public class CarTPC extends VehicleTPC {
    private int doors;
    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }
}
