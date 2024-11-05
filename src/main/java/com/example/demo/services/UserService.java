package com.example.demo.services;

import com.example.demo.dtos.UserDTO;
import com.example.demo.models.User;
import com.example.demo.repositories.IUserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
  private final IUserRepository userRepository;

  public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Mono<User> createUser(UserDTO userDTO) {
    return userRepository.save(User.builder().name(userDTO.getName()).email(userDTO.getEmail()).build());
  }
}
