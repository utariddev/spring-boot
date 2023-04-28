package org.utarid.restdemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.utarid.restdemo.UserDTO;
import org.utarid.restdemo.service.IUserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    public UserController(@Qualifier("adminUserService") IUserService userService) {
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
