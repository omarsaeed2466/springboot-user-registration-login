package com.example.springbootuserregistrationlogin.Service;

import com.example.springbootuserregistrationlogin.Model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Override
    public void saveUser(User user) {

    }

    @Override
    public boolean isUserPresent(User user) {
        return false;
    }
}
