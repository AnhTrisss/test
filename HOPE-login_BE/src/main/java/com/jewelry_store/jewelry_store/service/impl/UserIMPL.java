package com.jewelry_store.jewelry_store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jewelry_store.jewelry_store.dto.LoginDTO;
import com.jewelry_store.jewelry_store.dto.UserDTO;
import com.jewelry_store.jewelry_store.entity.User;
import com.jewelry_store.jewelry_store.reponse.LoginMesage;
import com.jewelry_store.jewelry_store.repository.UserRepository;
import com.jewelry_store.jewelry_store.service.UserService;

@Service
public class UserIMPL implements UserService {

    @Autowired
    public UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO addUser(UserDTO UserDTO) {
        User user = new User(
                UserDTO.getAccountID(),
                UserDTO.getUsername(),
                this.passwordEncoder.encode(UserDTO.getPassword()),
                UserDTO.getRole());
        userRepository.save(user);
        UserDTO newUserDTO = new UserDTO(
                user.getAccountID(),
                user.getUserName(),
                user.getPassword(),
                user.getRole());

        return newUserDTO;
    }

    public UserDTO UserDTO;

    @Override
    public LoginMesage loginUser(LoginDTO loginDTO) {
        User user1 = userRepository.findByName(loginDTO.getUsername());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);

            if (isPwdRight) {
                return new LoginMesage("Login Success", true);
            } else {
                return new LoginMesage("Password Not Match", false);
            }
        } else {
            return new LoginMesage("UserName not exists", false);
        }
    }

// ============================================================================================
    @Override
    public UserDTO updateUser(Long accountID) {
        User user = userRepository.findById(accountID).get();
        UserDTO userDTO = new UserDTO(
            user.getAccountID(),
            user.getUserName(),
            user.getPassword(),
            user.getRole());
    return userDTO;
}

    public void deleteUser(Long accountID) {
        userRepository.deleteById(accountID);
    }
}
// ============================================================================================
