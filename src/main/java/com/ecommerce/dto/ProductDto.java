package com.ecommerce.dto;

import com.ecommerce.model.Product;

public class ProductDto {
    private Long id;
    private String name;
    private double price;
    private String description;

    //  Default Constructor (needed for JSON mapping)
    public ProductDto() {}

    // Constructor to convert Product to ProductDto
    public ProductDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
