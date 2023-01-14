package com.example.springbootuserregistrationlogin.Service;

import com.example.springbootuserregistrationlogin.Model.User;

public interface UserService {
    public void saveUser(User user);
    public boolean isUserPresent(User user);
}
