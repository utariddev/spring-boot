package org.utarid.restdemo.controller;

import org.springframework.web.bind.annotation.*;
import org.utarid.restdemo.UserDTO;
import org.utarid.restdemo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/create")
    public void createUser(@RequestBody UserDTO user) {
        userService.createUser(user);
    }
}
