package com.biz;

import com.entity.User;

import java.util.List;

public interface UserBiz {
    List<User> getAll();

    User getUserById(Integer id);
}
