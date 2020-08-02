package com.biz.impl;

import com.biz.UserBiz;
import com.dao.UserDAO;
import com.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserBizImpl implements UserBiz {

    @Resource
    private UserDAO userDAO;


    @Override
    public List<User> getAll() {
        System.out.println("查询所有 业务层");
        return userDAO.getAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userDAO.getUserById(id);
    }
}
