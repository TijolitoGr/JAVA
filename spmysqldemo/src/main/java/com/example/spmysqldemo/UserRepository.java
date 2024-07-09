package com.example.spmysqldemo;

import org.springframework.data.repository.CrudRepository;

// O CRUD será AUTO IMPLEMENTADO pelo Spring num Bean chamado userRepository

public interface UserRepository extends CrudRepository<User, Integer> {

}