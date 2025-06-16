package com.felipesantos.provapa.service;

import com.felipesantos.provapa.dto.UserDTO;
import com.felipesantos.provapa.model.User;
import com.felipesantos.provapa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDTO create(UserDTO dto){
        User user = new User();
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setUsername(dto.getUsername());
        user.setRole(dto.getRole());

        userRepository.save(user);
        return dto;
    }
}
