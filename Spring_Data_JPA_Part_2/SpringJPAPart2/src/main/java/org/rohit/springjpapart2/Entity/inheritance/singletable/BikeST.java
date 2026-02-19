package org.rohit.springjpapart2.Entity.inheritance.singletable;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("BIKE")
public class BikeST extends VehicleST {
    private boolean carrier;

    public boolean isCarrier() { return carrier; }
    public void setCarrier(boolean carrier) { this.carrier = carrier; }
}

