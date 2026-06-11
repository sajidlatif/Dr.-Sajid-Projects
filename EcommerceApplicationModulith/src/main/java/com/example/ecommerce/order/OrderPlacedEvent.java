package com.example.ecommerce.order;

public record OrderPlacedEvent(Long orderId, String product, int quantity) {}