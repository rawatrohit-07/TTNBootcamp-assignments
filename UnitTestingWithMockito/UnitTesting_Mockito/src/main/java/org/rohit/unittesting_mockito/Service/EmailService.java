package org.rohit.unittesting_mockito.Service;


import org.rohit.unittesting_mockito.domain.Order;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

    private static EmailService instance;

    public EmailService() {
    }

    public static EmailService getInstance() {
        if (instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    void sendEmail(Order order) {
        order.setCustomerNotified(false);
        throw new RuntimeException("An Exception Occurred");
    }

    boolean sendEmail(Order order, String cc) {
        order.setCustomerNotified(true);
        return true;
    }
}

