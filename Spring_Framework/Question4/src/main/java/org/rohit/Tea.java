package org.rohit;
import org.springframework.stereotype.Component;

@Component
public class Tea {
    private String name = "Tom Uncle Special Tea";
    private int price = 25;

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
