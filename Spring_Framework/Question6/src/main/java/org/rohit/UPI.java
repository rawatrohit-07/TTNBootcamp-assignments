package org.rohit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class UPI implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid : " + amount + " using UPI");
    }
}
