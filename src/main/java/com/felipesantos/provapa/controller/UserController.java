package com.felipesantos.provapa.controller;

import com.felipesantos.provapa.dto.UserDTO;
import com.felipesantos.provapa.service.RegisterService;
import com.felipesantos.provapa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RegisterService registerService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO dto){
        UserDTO response = registerService.create(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId())
                        .toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
