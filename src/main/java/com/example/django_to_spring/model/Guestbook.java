package com.example.django_to_spring.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Guestbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String message;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getter & Setter
}
