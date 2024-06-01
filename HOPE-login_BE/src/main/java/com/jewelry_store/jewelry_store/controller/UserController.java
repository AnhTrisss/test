package com.jewelry_store.jewelry_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jewelry_store.jewelry_store.dto.LoginDTO;
import com.jewelry_store.jewelry_store.dto.UserDTO;

import com.jewelry_store.jewelry_store.reponse.LoginMesage;
import com.jewelry_store.jewelry_store.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
@RequestMapping("/api")

public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        UserDTO user = userService.addUser(userDTO);
        return user;
    }

    @GetMapping("/edit")
    public UserDTO editUser(@RequestParam("id") Long id) {
        UserDTO user = userService.updateUser(id);
        return user;
        }

    @DeleteMapping(path = "/delete/{accountId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long accountId) {
        try {
            userService.deleteUser(accountId);
            return ResponseEntity.ok("User deleted successfully");
        } catch (UsernameNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }


    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginMesage loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
