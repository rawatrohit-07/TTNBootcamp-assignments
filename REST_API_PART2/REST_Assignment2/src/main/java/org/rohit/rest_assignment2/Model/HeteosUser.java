package org.rohit.rest_assignment2.Model;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HeteosUser extends RepresentationModel<HeteosUser> {
    private Integer id;
    private String name;
    private String email;
}
