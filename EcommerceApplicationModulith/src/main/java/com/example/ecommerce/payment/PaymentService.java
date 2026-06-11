package com.example.ecommerce.payment;

import com.example.ecommerce.order.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @EventListener
    public void handleOrderPlaced(OrderPlacedEvent event) {
        System.out.println("💳 Payment processed for Order: " + event.orderId());
    }
}