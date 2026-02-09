package org.rohit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springbean.xml");
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.serve();
    }
}
