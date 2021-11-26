package com.example.demo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.io.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDto createUser(UserDto user) {
		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncypted_Password("test");
		userEntity.setUser_ID("testUser_ID");
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		
		UserDto returnValue =new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return null;
	}

}
