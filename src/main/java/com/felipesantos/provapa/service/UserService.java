package com.felipesantos.provapa.service;

import com.felipesantos.provapa.dto.UserDTO;
import com.felipesantos.provapa.model.User;
import com.felipesantos.provapa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user != null) return user;
        else throw new UsernameNotFoundException("Username "+username+" not found!");
    }

    public List<UserDTO> findAll(){
        return List.of();
    }
}
