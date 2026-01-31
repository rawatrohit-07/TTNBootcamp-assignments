package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void testPlaceOrderPriceWithTaxCalculated() {
        OrderService orderService = new OrderService();
        Order order = new Order(1, "Mobile Phone", 20000);

        try {
            orderService.placeOrder(order);
        } catch (RuntimeException e) {
            // expected
        }

        assertEquals(24000, order.getPriceWithTax());
    }

    @Test
    void testSendEmailThrowsException() {
        EmailService emailService = new EmailService();
        Order order = new Order(1, "Lays", 20);

        RuntimeException ex = assertThrows(
                RuntimeException.class,
                () -> emailService.sendEmail(order)
        );

        assertEquals("An Exception Occurred", ex.getMessage());
    }

    @Test
    void testPlaceOrderWithCC_shouldReturnTrue() {
        OrderService orderService = new OrderService();
        Order order = new Order(1, "Mouse", 2000);
        boolean result = orderService.placeOrder(order, "demoTestingMail@test.com");
        assertTrue(result);
    }

    @Test
    void testPlaceOrderWithCC_customerNotifiedTrue() {
        OrderService orderService = new OrderService();
        Order order = new Order(1, "SSD", 15000);
        orderService.placeOrder(order, "demoTestingMail@test.com");
        assertTrue(order.isCustomerNotified());
    }
}
