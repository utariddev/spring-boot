package org.utarid.restdemo.service;

import org.utarid.restdemo.UserDTO;

import java.util.List;

public interface IUserService {
    public void createUser(UserDTO userDTO);

    public List<UserDTO> getAllUsers();
}
