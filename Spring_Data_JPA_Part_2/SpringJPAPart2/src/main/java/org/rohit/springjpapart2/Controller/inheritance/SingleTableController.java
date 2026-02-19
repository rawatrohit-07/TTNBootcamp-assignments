package org.rohit.springjpapart2.Controller.inheritance;

import org.rohit.springjpapart2.Entity.inheritance.singletable.BikeST;
import org.rohit.springjpapart2.Entity.inheritance.singletable.CarST;
import org.rohit.springjpapart2.Entity.inheritance.singletable.VehicleST;
import org.rohit.springjpapart2.Service.inheritance.SingleTableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inheritance/singletable")
public class SingleTableController {

    private final SingleTableService service;

    public SingleTableController(SingleTableService service) {
        this.service = service;
    }

    @PostMapping("/car")
    public VehicleST createCar(@RequestBody CarST car) {
        return service.save(car);
    }

    @PostMapping("/bike")
    public VehicleST createBike(@RequestBody BikeST bike) {
        return service.save(bike);
    }

    @GetMapping
    public List<VehicleST> getAll() {
        return service.findAll();
    }
}
