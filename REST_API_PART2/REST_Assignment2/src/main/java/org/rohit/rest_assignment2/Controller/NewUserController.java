package org.rohit.rest_assignment2.Controller;

import org.rohit.rest_assignment2.DTO.UserV1;
import org.rohit.rest_assignment2.DTO.UserV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Q5. Versioning Restful APIs Create 2 API for showing user details.
// The first api should return only basic details of the user and the other API should return
// more/enhanced details of the user, Now apply versioning using the following methods:
// A) URI versioning
// B) Request Parameter versioning
// C) Custom Header Versioning
// D) MimeType Versioning
@RestController
@RequestMapping("/api")
public class NewUserController {
    // A) URI Versioning
    // V1
    @GetMapping("/v1/user")
    public UserV1 getUserV1() {
        return new UserV1("Rohit Rawat", "rohit@gmail.com");
    }

    // V2
    @GetMapping("/v2/user")
    public UserV2 getUserV2() {
        return new UserV2(
                "Rohit Rawat",
                "rohit@gmail.com",
                "9897683764",
                "Uttarakhand, India");
    }

    // -------------------------------------------------------------------------------
    // B) Request Parameter Versioning
    // V1
    @GetMapping(value = "/user", params = "version=1")
    public UserV1 getUserV1Param() {
        return new UserV1("Rohit", "rohit@gmail.com");
    }

    // V2
    @GetMapping(value = "/user", params = "version=2")
    public UserV2 getUserV2Param() {
        return new UserV2(
                "Rohit",
                "rohit@gmail.com",
                "9897683764",
                "Uttarakhand, India");
    }

    // ------------------------------------------------------------------------------------
    // C) Custom Header Versioning
    // V1
    @GetMapping(value = "/user", headers = "X-API-VERSION=1")
    public UserV1 getUserV1Header() {
        return new UserV1("Rohit", "rohit@gmail.com");
    }

    // V2
    @GetMapping(value = "/user", headers = "X-API-VERSION=2")
    public UserV2 getUserV2Header() {
        return new UserV2(
                "Rohit",
                "rohit@gmail.com",
                "9897683764",
                "Uttarakhand, India");
    }

    // ------------------------------------------------------------------------------------
    // D) Mime Type Versioning
    // V1
    @GetMapping(value = "/user", produces = "application/vnd.company.app-v1+json")
    public UserV1 getUserV1Mime() {
        return new UserV1("Rohit", "rohit@gmail.com");
    }

    // V2
    @GetMapping(value = "/user", produces = "application/vnd.company.app-v2+json")
    public UserV2 getUserV2Mime() {
        return new UserV2(
                "Rohit",
                "rohit@gmail.com",
                "9897683764",
                "Uttarakhand, India");
    }
}
