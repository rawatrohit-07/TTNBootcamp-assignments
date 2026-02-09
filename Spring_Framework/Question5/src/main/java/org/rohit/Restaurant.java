package org.rohit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    private final Cuisine cuisine;
    @Autowired
    public Restaurant(@Qualifier("Chinese") Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public void serve() {
        cuisine.prepareFood();
    }
}
