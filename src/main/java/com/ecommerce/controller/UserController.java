package com.ecommerce.controller;

import com.ecommerce.dto.UserDto;
import com.ecommerce.model.User;
import com.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST - Create a new user
    @PostMapping
    public User createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    // GET - Retrieve all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // PUT - Update user by ID
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        User updatedUser = userService.updateUser(id, userDto);
        if (updatedUser != null) {
            return "User with ID " + id + " has been updated successfully.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }

    // DELETE - Delete a user by ID
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean deleted = userService.deleteUser(id);
        if (deleted) {
            return "User with ID " + id + " has been deleted successfully.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }
}
