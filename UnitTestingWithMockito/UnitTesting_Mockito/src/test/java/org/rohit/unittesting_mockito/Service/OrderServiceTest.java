package org.rohit.unittesting_mockito.Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.rohit.unittesting_mockito.domain.Order;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Test
    void placeOrder_withCC_shouldSetTax_andNotifyCustomer() {
        // given
        Order order = new Order(2, "Mobile Phone", 10000.0);
        when(emailService.sendEmail(order, "demo@test.com")).thenReturn(true);

        // when
        boolean result = orderService.placeOrder(order, "demo@test.com");

        // then
        assertTrue(result);
        assertEquals(2000.0, order.getPriceWithTax());
        assertTrue(order.isCustomerNotified());
        verify(emailService).sendEmail(order, "demo@test.com");
        verifyNoMoreInteractions(emailService);
    }

    @Test
    void placeOrder_withoutCC_shouldThrowException_whenEmailFails() {
        // given
        Order order = new Order(1, "Tablet", 3000.0);
        doThrow(new RuntimeException("An Exception Occurred"))
                .when(emailService).sendEmail(order);

        // when + then
        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> orderService.placeOrder(order));

        assertEquals("An Exception Occurred", ex.getMessage());
        verify(emailService).sendEmail(order);
        verifyNoMoreInteractions(emailService);
    }
}
