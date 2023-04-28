package org.utarid.restdemo.service;

import org.springframework.stereotype.Service;
import org.utarid.restdemo.UserDTO;
import org.utarid.restdemo.repository.UserEntity;
import org.utarid.restdemo.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminUserService implements IUserService {

    private final UserRepository userRepository;

    public AdminUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserDTO userDTO) {
        UserEntity userEntity = userDTO.toEntity();
        userEntity.setAdmin(true);
        userRepository.save(userEntity);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(UserDTO::toDTO).collect(Collectors.toList());
    }
}
