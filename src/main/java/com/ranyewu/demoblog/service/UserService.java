package com.ranyewu.demoblog.service;

import com.ranyewu.demoblog.po.User;

public interface UserService {
    public User checkUser(String username, String password);
}
