package org.rohit.rest_assignment2.Controller;
import java.util.ArrayList;
import java.util.List;

import org.rohit.rest_assignment2.Model.DynamicUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;


// Dynamic filtering
// B) Create another API that does the same by using Dynamic Filtering.
@RestController
public class DynamicFilterController {
    private List<DynamicUser> users = new ArrayList<>();
    @SuppressWarnings("removal")
    @PostMapping("/dynamic")
    public ResponseEntity<MappingJacksonValue> saveUserDynamic(@RequestBody DynamicUser user) {

        users.add(user);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name", "email");

        SimpleFilterProvider provider = new SimpleFilterProvider().addFilter("UserFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(user);
        mapping.setFilters(provider);

        return ResponseEntity.status(HttpStatus.CREATED).body(mapping);
    }
}
