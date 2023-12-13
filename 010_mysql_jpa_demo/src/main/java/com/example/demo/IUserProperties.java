package com.example.demo;

import com.example.demo.utils.Users;

public interface IUserProperties {
    Iterable<Users> getUsers();
    
    void setUser(String first_name, String last_name, String username, String password);
}
