package org.utarid.restdemo.service;

import org.springframework.stereotype.Service;
import org.utarid.restdemo.UserDTO;
import org.utarid.restdemo.repository.UserEntity;
import org.utarid.restdemo.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserDTO userDTO) {
        UserEntity userEntity = userDTO.toEntity();
        userRepository.save(userEntity);
    }

    public List<UserDTO> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(UserDTO::toDTO).collect(Collectors.toList());
    }
}
