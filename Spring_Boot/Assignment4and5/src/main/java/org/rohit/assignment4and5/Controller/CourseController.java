package org.rohit.assignment4and5.Controller;

import org.rohit.assignment4and5.Model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/Course")
    public List<Course> getCourses() {
        return Arrays.asList(
                new Course(1,"Himanshu Sharma","JVM"),
                new Course(2,"Ishmeet","JavaScript"),
                new Course(3,"Lakshay","DataEngineer"),
                new Course(4,"Krish","Devops"),
                new Course(5,"Rakshit","QE")

        );
    }
}
