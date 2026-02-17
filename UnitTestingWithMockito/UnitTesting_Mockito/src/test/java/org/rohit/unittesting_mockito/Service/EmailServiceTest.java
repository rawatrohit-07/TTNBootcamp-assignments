package org.rohit.unittesting_mockito.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.rohit.unittesting_mockito.domain.Order;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class EmailServiceTest {

    @Spy
    private EmailService emailService;

    @Test
    void sendEmail_withoutCC_shouldThrowException_andSetNotifiedFalse() {
        Order order = new Order(1, "Mobile Phone", 10000.0);

        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> emailService.sendEmail(order));

        assertEquals("An Exception Occurred", ex.getMessage());
        assertFalse(order.isCustomerNotified());

        verify(emailService).sendEmail(order);
    }

    @Test
    void sendEmail_withCC_shouldReturnTrue_andSetNotifiedTrue() {
        Order order = new Order(1, "Tablet", 30000.0);

        boolean result = emailService.sendEmail(order, "demo@test.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());

        verify(emailService).sendEmail(order, "demo@test.com");
    }
}