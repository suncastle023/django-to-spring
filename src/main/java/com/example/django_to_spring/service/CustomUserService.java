package com.example.django_to_spring.service;

import com.example.django_to_spring.model.CustomUser;
import com.example.django_to_spring.repository.CustomUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserService {

    @Autowired
    private CustomUserRepository customUserRepository;

    public CustomUser saveUser(CustomUser user) {
        return customUserRepository.save(user);
    }

    public Optional<CustomUser> findById(String id) {
        return customUserRepository.findById(id);
    }
}
