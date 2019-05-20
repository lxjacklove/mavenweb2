package com.me.dao;

/**
 * @author Mr Li
 * @create 2019
 */
import com.me.entity.*;
public interface UserDao {
    public void addUser(User user);
    public User getUser(Integer id);
}

