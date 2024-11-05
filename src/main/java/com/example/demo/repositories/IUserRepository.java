package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IUserRepository extends ReactiveCrudRepository<User, Integer> {
}
