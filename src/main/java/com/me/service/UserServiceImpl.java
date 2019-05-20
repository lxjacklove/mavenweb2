package com.me.service;


import com.me.dao.UserDao;
import com.me.dto.UserDTO;
import com.me.entity.User;
import org.springframework.beans.BeanUtils;

/**
 * @author Mr Li
 * @create 2019
 */
public class UserServiceImpl implements UserService {

    //依赖持久层：注入
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(UserDTO dto) {
        User user=new User();
        //方式一
       /* user.setUsername(dto.getUserName());
        user.setPassword(dto.getUserPass());*/
        BeanUtils.copyProperties(dto,user);//对象之间复制，里面类型名需要一致
        userDao.addUser(user);
    }

    @Override
    public UserDTO getUser(Integer id) {
        User user=userDao.getUser(id);
        UserDTO dto=new UserDTO();
        BeanUtils.copyProperties(user,dto);
        return dto;
    }
}
