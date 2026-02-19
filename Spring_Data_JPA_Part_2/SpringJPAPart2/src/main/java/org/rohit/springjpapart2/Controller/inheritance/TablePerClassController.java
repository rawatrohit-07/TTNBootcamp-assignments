package org.rohit.springjpapart2.Controller.inheritance;
import org.rohit.springjpapart2.Entity.inheritance.tableperclass.BikeTPC;
import org.rohit.springjpapart2.Entity.inheritance.tableperclass.CarTPC;
import org.rohit.springjpapart2.Entity.inheritance.tableperclass.VehicleTPC;
import org.rohit.springjpapart2.Service.inheritance.TablePerClassService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inheritance/tableperclass")
public class TablePerClassController {

    private final TablePerClassService service;

    public TablePerClassController(TablePerClassService service) {
        this.service = service;
    }

    @PostMapping("/car")
    public VehicleTPC createCar(@RequestBody CarTPC car) {
        return service.save(car);
    }

    @PostMapping("/bike")
    public VehicleTPC createBike(@RequestBody BikeTPC bike) {
        return service.save(bike);
    }

    @GetMapping
    public List<VehicleTPC> getAll() {
        return service.findAll();
    }
}
