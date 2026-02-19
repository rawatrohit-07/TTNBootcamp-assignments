package org.rohit.springjpapart2.Controller.inheritance;
import org.rohit.springjpapart2.Entity.inheritance.joined.BikeJ;
import org.rohit.springjpapart2.Entity.inheritance.joined.CarJ;
import org.rohit.springjpapart2.Entity.inheritance.joined.VehicleJ;
import org.rohit.springjpapart2.Service.inheritance.JoinedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inheritance/joined")
public class JoinedController {

    private final JoinedService service;

    public JoinedController(JoinedService service) {
        this.service = service;
    }

    @PostMapping("/car")
    public VehicleJ createCar(@RequestBody CarJ car) {
        return service.save(car);
    }

    @PostMapping("/bike")
    public VehicleJ createBike(@RequestBody BikeJ bike) {
        return service.save(bike);
    }

    @GetMapping
    public List<VehicleJ> getAll() {
        return service.findAll();
    }
}
