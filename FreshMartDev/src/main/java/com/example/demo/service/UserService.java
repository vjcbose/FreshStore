package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.shared.dto.UserDto;


@Service
public interface UserService {
  UserDto createUser(UserDto user);
}
