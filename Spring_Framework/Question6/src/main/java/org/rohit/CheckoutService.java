package org.rohit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CheckoutService {
    private final PaymentService paymentService;

    @Autowired
    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        System.out.println("Processing checkout");
        paymentService.pay(amount);
    }
}
