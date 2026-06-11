package com.example.ecommerce.order;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import com.example.ecommerce.order.Order; // ✅ correct 


import java.util.List;

@Service
//@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final ApplicationEventPublisher publisher;
    
    
    // Constructor injection (Spring will inject these automatically)
    public OrderService(OrderRepository repository, ApplicationEventPublisher publisher) {
        this.repository = repository;
        this.publisher = publisher;
    }

    

    // -------------------------------
    // Place a new order
    // -------------------------------
    public Order placeOrder(String product, int quantity) {
        // Save the order
        Order order = repository.save(new Order(null, product, quantity));

        // Publish an event
        publisher.publishEvent(
            new OrderPlacedEvent(order.getId(), product, quantity)
        );

        return order;
    }

    // -------------------------------
    // Get all orders
    // -------------------------------
    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}
