package com.example.demo;

import com.example.demo.utils.IUsers;
import com.example.demo.utils.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UsersAdapterImpl implements IUserProperties {
    @Bean
    UsersAdapterImpl usersAdapter() {
        return new UsersAdapterImpl();
    }

    @Autowired
    private IUsers users;

    @Override
    public Iterable<Users> getUsers() {
        return this.users.findAll();
    }

    @Override
    public void setUser(String first_name, String last_name, String username, String password) {
        Users user = new Users(first_name, last_name, username, password);
        users.save(user);
    }

}
