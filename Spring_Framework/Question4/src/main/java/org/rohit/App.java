package org.rohit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springbean.xml");
        Tea tea = context.getBean(Tea.class);
        System.out.println("Tea Name   : " + tea.getName());
        System.out.println("Tea Price  : " + tea.getPrice());
    }
}
