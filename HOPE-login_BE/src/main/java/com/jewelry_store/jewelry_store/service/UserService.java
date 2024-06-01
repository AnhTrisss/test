package com.jewelry_store.jewelry_store.service;

import com.jewelry_store.jewelry_store.dto.LoginDTO;
import com.jewelry_store.jewelry_store.dto.UserDTO;
import com.jewelry_store.jewelry_store.reponse.LoginMesage;

public interface UserService {
    UserDTO addUser(UserDTO UserDTO);
    UserDTO updateUser(Long accountID);
    void deleteUser(Long accountID);
    LoginMesage loginUser(LoginDTO loginDTO);
}
