package org.zzh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zzh.dao.UserMapper;
import org.zzh.model.User;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUser() {
        User user = userMapper.getUser();
        return user;
    }
}
