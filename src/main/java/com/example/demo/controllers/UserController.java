package com.example.demo.controllers;

import com.example.demo.dtos.UserDTO;
import com.example.demo.models.User;
import com.example.demo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public Mono<User> createUser(@Valid @RequestBody UserDTO userDTO) {
    try {
      return userService.createUser(userDTO);
    } catch (Exception e) {
      System.out.println(e);
      return Mono.error(e);
    }
  }
}
