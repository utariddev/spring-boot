package org.utarid.restdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.utarid.restdemo.UserDTO;
import org.utarid.restdemo.repository.UserEntity;
import org.utarid.restdemo.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Primary
@Service
public class StandardUserService implements IUserService {

    private final UserRepository userRepository;

    public StandardUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(UserDTO userDTO) {
        UserEntity userEntity = userDTO.toEntity();
        userEntity.setAdmin(false);
        userRepository.save(userEntity);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(UserDTO::toDTO).collect(Collectors.toList());
    }
}
