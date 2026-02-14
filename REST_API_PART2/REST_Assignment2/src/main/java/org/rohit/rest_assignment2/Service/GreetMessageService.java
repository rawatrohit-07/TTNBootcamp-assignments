/// Ques1. Internationalization
/// A) Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
/// B) Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)


package org.rohit.rest_assignment2.Service;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GreetMessageService {

    private final MessageSource messageSource;

    public GreetMessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getGreeting(String username, Locale locale) {
        return messageSource.getMessage(
                "greeting",
                new Object[]{username},
                locale
        );
    }
}
