package com.example.demo;

import com.example.demo.utils.GetUsers;
import com.example.demo.utils.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UsersAdapterImpl implements UserProperties{
    @Bean
    UsersAdapterImpl usersAdapter(){
        return new UsersAdapterImpl();
    }

    @Autowired
    private GetUsers getUsers;

    @Override
    public Iterable<Users> getUsers() {
        return this.getUsers.findAll();
    }
}
