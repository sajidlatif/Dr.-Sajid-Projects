package com.example.ecommerce.inventory;

import com.example.ecommerce.order.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @EventListener
    public void handleOrderPlaced(OrderPlacedEvent event) {
        System.out.println("📦 Inventory updated for: " + event.product());
    }
}