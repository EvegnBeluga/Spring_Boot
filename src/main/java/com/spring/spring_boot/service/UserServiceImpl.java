package com.spring.spring_boot.service;

import com.spring.spring_boot.model.User;
import com.spring.spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {


        private final UserRepository userRepository;


@Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
            return userRepository.findById(id).orElse(null);
        }
        public List<User> findAll(){
            return userRepository.findAll();
        }
        public User saveUser(User user){
            return userRepository.save(user);
        }
        public void deleteById(Long id){
            userRepository.deleteById(id);
        }
}
