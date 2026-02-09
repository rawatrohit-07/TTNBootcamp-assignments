package com.rohit.Question3;
import org.springframework.stereotype.Component;
@Component
public class MasalaTea implements Tea {
    @Override
    public void prepare() {
        System.out.println("Preparing Masala Tea");
    }
}
