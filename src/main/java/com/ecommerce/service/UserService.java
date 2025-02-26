package com.ecommerce.service;

import com.ecommerce.dto.UserDto;
import com.ecommerce.model.User;
import java.util.List;

public interface UserService {
    User createUser(UserDto userDto);  // POST
    List<User> getAllUsers();          // GET
    boolean deleteUser(Long id);       // DELETE
    User updateUser(Long id, UserDto userDto);  // PUT
}
