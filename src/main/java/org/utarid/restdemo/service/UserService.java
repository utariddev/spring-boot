package org.utarid.restdemo.service;

import org.springframework.stereotype.Service;
import org.utarid.restdemo.User;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return Arrays.asList(new User("Mehmet", 30), new User("Ali", 40));
    }
}
