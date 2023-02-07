package com.wf.appstatus.springboot.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wf.appstatus.springboot.model.User;
import com.wf.appstatus.springboot.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Optional<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
