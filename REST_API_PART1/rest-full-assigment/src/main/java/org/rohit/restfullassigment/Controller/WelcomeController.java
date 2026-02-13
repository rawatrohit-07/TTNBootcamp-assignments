
/// Ques1. Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".

package org.rohit.restfullassigment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(path = "/welcome")
    public String getMessage() {
        return "Welcome to spring boot";
    }
}
