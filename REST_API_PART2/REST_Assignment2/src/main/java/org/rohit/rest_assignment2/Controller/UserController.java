package org.rohit.rest_assignment2.Controller;


import java.util.ArrayList;
import java.util.List;

import org.rohit.rest_assignment2.Model.User;
import org.rohit.rest_assignment2.Wrapper.UserList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

//Ques2.
// Content Negotiation
// A) Create POST Method to create user details which can accept XML for user creation.
// B) Create GET Method to fetch the list of users in XML format.
@RestController
@RequestMapping("/users")
@Tag(name = "User Management", description = "APIs for managing user information including creation, retrieval and deletion.")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping(produces = "application/xml")
    public ResponseEntity<UserList> getAllUsers() {
        return ResponseEntity.ok(new UserList(users));
    }

    //Ques3. Swagger
    // A) Configure the swagger plugin and create a document of the following methods:
    // Get details of the User using GET request.
    // Save details of the user using POST request.
    // Delete a user using DELETE request.
    // B) In swagger documentation, add the description of each class and URI so
    // that in swagger UI the purpose of class and URI is clear.

    @GetMapping(value = "/{id}", produces = "application/xml")
    @Operation(summary = "Get user details by ID", description = "Fetches complete information of a user based on the provided user ID.")
    public ResponseEntity<User> getUser(
            @Parameter(description = "Unique ID of the user", example = "1") @PathVariable int id) {
        return ResponseEntity.ok(users.get(id - 1));
    }

    @PostMapping(value = "/xml/usercreate", consumes = "application/xml", produces = "application/xml")
    @Operation(summary = "Create a new user", description = "Saves user details into the system and returns the created user.")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete user by ID", description = "Removes the user from the system using the specified user ID.")
    public ResponseEntity<String> deleteUser(
            @Parameter(description = "ID of the user to delete", example = "1") @PathVariable Integer id) {

        users.removeIf(user -> user.getId().equals(id));
        return ResponseEntity.ok("User deleted successfully");
    }
}

