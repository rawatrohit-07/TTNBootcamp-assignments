package org.rohit.rest_assignment2.Model;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.Data;

@Data
@JsonFilter("UserFilter")
public class DynamicUser {
    private Integer id;
    private String name;
    private String email;
    private String password;
}
