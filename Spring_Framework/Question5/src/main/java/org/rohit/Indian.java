package org.rohit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Indian implements Cuisine {
    @Override
    public void prepareFood() {
        System.out.println("Preparing Indian cuisine...");
    }
}
