package org.rohit.springsecurityassignment.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/dashboard")
    public String dashboard() {
        return "ADMIN Dashboard";
    }
}