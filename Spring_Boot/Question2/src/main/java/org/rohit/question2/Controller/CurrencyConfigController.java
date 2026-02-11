package org.rohit.question2.Controller;

import org.rohit.question2.Config.CurrencyServiceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

    private final CurrencyServiceProperties properties;

    public CurrencyConfigController(CurrencyServiceProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/currency-configuration")
    public CurrencyServiceProperties getAllConfiguration() {
        return properties;
    }
}