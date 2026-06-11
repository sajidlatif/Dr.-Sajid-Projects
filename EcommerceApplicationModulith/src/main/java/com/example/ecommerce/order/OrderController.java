package com.example.ecommerce.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
//@RequiredArgsConstructor
public class OrderController {

    private final OrderService service ;
    
 // Constructor injection
    public OrderController(OrderService service) {
        this.service = service;
    }
    
    // Home endpoint
    @GetMapping("/")
    public String home() {
        return "E-commerce Application is running!";
    }
    
    // -------------------------------
    // POST endpoint for API clients
    // -------------------------------
    @PostMapping("/add")
    public Order placeOrderPost(@RequestParam String product,
                                @RequestParam int quantity) {
        return service.placeOrder(product, quantity);
    }

    // -------------------------------
    // GET endpoint for browser testing
    // -------------------------------
    @GetMapping("/place")
    public Order placeOrderGet(@RequestParam String product,
                               @RequestParam int quantity) {
        return service.placeOrder(product, quantity);
    }

    // -------------------------------
    // GET all orders
    // -------------------------------
    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }
}