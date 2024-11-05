package com.example.demo.repositories;

import com.example.demo.models.Todo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ITodoRepository extends ReactiveCrudRepository<Todo, Integer> {
  Flux<Todo> findByUserId(Integer userId);
}