package com.rohit.Question3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant{
    private Tea tea;

    @Autowired
    public Restaurant(@Qualifier("masalaTea") Tea tea) {
        this.tea = tea;
    }
    public void serveTea() {
        System.out.println("Restaurant is serving tea");
        tea.prepare();
    }
}