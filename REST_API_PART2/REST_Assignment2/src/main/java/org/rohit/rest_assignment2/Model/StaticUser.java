package org.rohit.rest_assignment2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class StaticUser {

    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
