package org.rohit.rest_assignment2.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@JacksonXmlRootElement(localName = "user")
@Data
@Schema(description = "Represents a user entity in the system.")
public class User {

    @Schema(description = "Unique identifier of the user", example = "1")
    private Integer id;

    @Schema(description = "Full name of the user", example = "Rohit Rawat")
    private String name;

    @Schema(description = "Email address of the user", example = "rohit@mail.com")
    private String email;

    // getters & setters
}
