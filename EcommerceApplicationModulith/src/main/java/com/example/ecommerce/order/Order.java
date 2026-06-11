package com.example.ecommerce.order;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "customer_orders") // ✅ plural or any other name
public class Order {
	

    public Order() {
		super();
	}
	public Order(Long id, String product, int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;
    private int quantity;
	public Long getId() {
		return id;
	}
	public String getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}