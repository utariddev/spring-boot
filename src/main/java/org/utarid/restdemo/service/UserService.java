package org.utarid.restdemo.service;

import org.springframework.stereotype.Service;
import org.utarid.restdemo.repository.UserEntity;
import org.utarid.restdemo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
