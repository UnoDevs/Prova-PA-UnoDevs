package com.felipesantos.provapa.service;

import com.felipesantos.provapa.dto.AccountCredentialsDTO;
import com.felipesantos.provapa.dto.TokenDTO;
import com.felipesantos.provapa.model.User;
import com.felipesantos.provapa.repository.UserRepository;
import com.felipesantos.provapa.security.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider tokenProvider;
    @Autowired
    private UserRepository userRepository;

    public TokenDTO login(AccountCredentialsDTO dto){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getUsername(),
                        dto.getPassword()
                )
        );

        User user = userRepository.findByUsername(dto.getUsername());
        if (user == null) throw new UsernameNotFoundException("Username " + dto.getUsername() + " not found");
        return tokenProvider.createAccessToken(user.getUsername(),user.getRole().getRole());
    }
}
