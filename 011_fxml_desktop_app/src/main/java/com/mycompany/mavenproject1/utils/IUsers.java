package com.mycompany.mavenproject1.utils;

import org.springframework.data.repository.CrudRepository;

public interface IUsers extends CrudRepository<Users, Integer> {
}
