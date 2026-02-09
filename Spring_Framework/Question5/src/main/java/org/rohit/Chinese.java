package org.rohit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("Chinese")
public class Chinese implements Cuisine {
    @Override
    public void prepareFood() {
        System.out.println("Preparing Chinese cuisine...");
    }
}
