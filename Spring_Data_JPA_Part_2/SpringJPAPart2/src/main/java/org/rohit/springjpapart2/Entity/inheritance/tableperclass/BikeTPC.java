package org.rohit.springjpapart2.Entity.inheritance.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bike_tpc")
public class BikeTPC extends VehicleTPC {
    private boolean carrier;
    public boolean isCarrier() { return carrier; }
    public void setCarrier(boolean carrier) { this.carrier = carrier; }
}
