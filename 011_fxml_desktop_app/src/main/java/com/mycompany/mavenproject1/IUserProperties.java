package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.utils.Users;

public interface IUserProperties {
    Iterable<Users> getUsers();
    
    void setUser(String first_name, String last_name, String username, String password);
}
