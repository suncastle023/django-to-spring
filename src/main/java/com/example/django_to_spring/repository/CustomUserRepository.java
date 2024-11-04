package com.example.django_to_spring.repository;

import com.example.django_to_spring.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomUserRepository extends JpaRepository<CustomUser, String> {
    Optional<CustomUser> findById(String id);
}
