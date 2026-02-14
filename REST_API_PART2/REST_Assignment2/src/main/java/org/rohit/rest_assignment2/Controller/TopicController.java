package org.rohit.rest_assignment2.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @GetMapping
    public List<String> getAllTopics() {
        return List.of("SpringBoot", "Java", "JavaScript");
    }

}
