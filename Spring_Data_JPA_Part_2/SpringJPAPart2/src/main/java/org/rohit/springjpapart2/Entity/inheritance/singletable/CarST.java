package org.rohit.springjpapart2.Entity.inheritance.singletable;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CAR")
public class CarST extends VehicleST {
    private int doors;

    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }
}
