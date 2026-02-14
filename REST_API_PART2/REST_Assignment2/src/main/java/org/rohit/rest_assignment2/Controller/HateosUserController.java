package org.rohit.rest_assignment2.Controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.rohit.rest_assignment2.Model.HeteosUser;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Ques6. HATEOAS A) Configure hateoas with your springboot application.
// Create an api which returns User Details along with url to show all topics.
@RestController
@RequestMapping("/users")
public class HateosUserController {

    @GetMapping("/{id}")
    public EntityModel<HeteosUser> getUser(@PathVariable Integer id) {

        HeteosUser user = new HeteosUser(id, "Rohit", "rohit@gmail.com");

        EntityModel<HeteosUser> model = EntityModel.of(user);

        // Self link
        model.add(linkTo(methodOn(HateosUserController.class)
                .getUser(id)).withSelfRel());

        // Link to all topics
        model.add(linkTo(methodOn(TopicController.class)
                .getAllTopics()).withRel("all-topics"));

        return model;
    }
}
