package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    void testsendEmail_shouldThrowException() {

        EmailService emailService = new EmailService();
        Order order = new Order(1, "Book", 100);

        RuntimeException ex = assertThrows(
                RuntimeException.class,
                () -> emailService.sendEmail(order)
        );

        assertEquals("An Exception Occurred", ex.getMessage());
    }

    @Test
    void testsendEmail_shouldSetCustomerNotifiedFalse() {

        EmailService emailService = new EmailService();
        Order order = new Order(1, "Pen", 50);

        try {
            emailService.sendEmail(order);
        } catch (RuntimeException e) {
        }

        assertFalse(order.isCustomerNotified());
    }

    @Test
    void testsendEmailWithCc_shouldReturnTrue() {

        EmailService emailService = new EmailService();
        Order order = new Order(2, "Notebook", 200);

        boolean result = emailService.sendEmail(order, "test@gmail.com");

        assertTrue(result);
    }

    @Test
    void testsendEmailWithCc_shouldSetCustomerNotifiedTrue() {

        EmailService emailService = new EmailService();
        Order order = new Order(1, "Pencil", 20);

        emailService.sendEmail(order, "cc@test.com");

        assertTrue(order.isCustomerNotified());
    }
}
