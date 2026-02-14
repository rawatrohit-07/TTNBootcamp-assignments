
/// Ques1. Internationalization
/// A) Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
/// B) Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)

package org.rohit.rest_assignment2.Model;

public class GreetMessage {
    private String message;

    public GreetMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
