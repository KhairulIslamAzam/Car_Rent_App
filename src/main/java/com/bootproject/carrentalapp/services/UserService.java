//package com.bootproject.carrentalapp.services;
//
//import com.bootproject.carrentalapp.models.User;
//import com.bootproject.carrentalapp.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//	@Autowired private BCryptPasswordEncoder encoder;
//
//	@Autowired private UserRepository userRepository;
//
//	public void save(User user) {
//
//		user.setPassword(encoder.encode(user.getPassword()));
//
//		userRepository.save(user);
//	}
//
//}
