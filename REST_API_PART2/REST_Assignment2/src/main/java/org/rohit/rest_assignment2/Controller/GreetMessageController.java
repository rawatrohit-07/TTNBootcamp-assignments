/// Ques1. Internationalization
/// A) Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
/// B) Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)

package org.rohit.rest_assignment2.Controller;

import org.rohit.rest_assignment2.Model.GreetMessage;
import org.rohit.rest_assignment2.Service.GreetMessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetMessageController {
    private final GreetMessageService greetingService;

    public GreetMessageController(GreetMessageService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public GreetMessage hello(@RequestParam String username, Locale locale) {
        String msg = greetingService.getGreeting(username, locale);
        return new GreetMessage(msg);
    }
}
