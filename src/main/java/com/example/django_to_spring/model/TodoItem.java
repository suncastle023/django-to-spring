package com.example.django_to_spring.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CustomUser user;

    private String title;
    private Boolean completed = false;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime completedAt;

    // Getter & Setter
}
