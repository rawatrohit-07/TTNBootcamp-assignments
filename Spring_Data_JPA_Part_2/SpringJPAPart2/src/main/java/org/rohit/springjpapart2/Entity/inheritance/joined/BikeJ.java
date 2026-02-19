package org.rohit.springjpapart2.Entity.inheritance.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bike_j")
public class BikeJ extends VehicleJ {
    private boolean carrier;
    public boolean isCarrier() { return carrier; }
    public void setCarrier(boolean carrier) { this.carrier = carrier; }
}
