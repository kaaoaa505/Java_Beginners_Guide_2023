package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    UsersAdapterImpl usersAdapter;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("********************************************************");
        var users = this.usersAdapter.getUsers();
        System.out.println(users);

        int count = 0;
        for (var ignored : users) {
            count++;
        }

        System.out.println(count);

        this.usersAdapter.setUser("First" + count, "last" + count, "Uname" + count, "Pass" + count);

        System.out.println(this.usersAdapter.getUsers());

        System.out.println("________________________________________________________");
    }
}
