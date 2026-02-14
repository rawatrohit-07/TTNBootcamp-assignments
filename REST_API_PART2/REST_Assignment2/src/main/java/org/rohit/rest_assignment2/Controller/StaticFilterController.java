package org.rohit.rest_assignment2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.rohit.rest_assignment2.Model.StaticUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//Q4.
// Static filtering
// A) Create API which saves details of User
// (along with the password) but on successfully saving
// returns only non-critical data. (Use static filtering)
@RestController
public class StaticFilterController {
    private List<StaticUser> users = new ArrayList<>();

    @PostMapping("/static")
    public ResponseEntity<StaticUser> saveUserStatic(@RequestBody StaticUser user) {
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
