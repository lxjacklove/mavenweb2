package com.me.service;

/**
 * @author Mr Li
 * @create 2019
 */
import com.me.dto.*;
public interface UserService {

    public void addUser(UserDTO dto);
    public UserDTO getUser(Integer id);


}
