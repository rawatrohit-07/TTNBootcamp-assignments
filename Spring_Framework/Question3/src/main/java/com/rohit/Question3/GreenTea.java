package com.rohit.Question3;
import org.springframework.stereotype.Component;
@Component
public class GreenTea implements Tea {
    @Override
    public void prepare() {
        System.out.println("Preparing Green Tea");
    }
}