package com.ecommerce.dto;

public class UserDto {
    private String name;
    private String email;

    // Constructor
    public UserDto() {}

    public UserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
