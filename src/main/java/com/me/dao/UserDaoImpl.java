package com.me.dao;

import com.me.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author Mr Li
 * @create 2019
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public void addUser(User user) {
        this.getSqlSession().insert("com.me.mapper.UserMapper.insertSelective",user);
    }

    @Override
    public User getUser(Integer id) {
        User user=this.getSqlSession().selectOne("com.me.mapper.UserMapper.selectByPrimaryKey",id);
        return user;
    }
}
