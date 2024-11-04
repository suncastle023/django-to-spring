package com.example.django_to_spring.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CustomUser {

    @Id
    @Column(length = 15, unique = true, nullable = false)
    private String id;

    private String name;
    private String email;
    private String major;
    private String nickname;
    private String password;
    private String phoneNumber;
    private Integer age;
    private String hobbies;

    @Lob
    private byte[] photo;

    // Getter & Setter
}
