package com.example.django_to_spring.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Post post;

    @ManyToOne
    private CustomUser user;

    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getter & Setter
}
