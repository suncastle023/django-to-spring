package com.example.django_to_spring.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CustomUser user;

    private String title;
    private String content;

    @Lob
    private byte[] image;

    @ManyToOne
    private Category category;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getter & Setter
}
