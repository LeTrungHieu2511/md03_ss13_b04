package com.example.md03.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password; // chuỗi đã mã hóa BCrypt

    @Column(nullable = false)
    private String role; // "USER", "ADMIN"

    @Column(nullable = false)
    private boolean enabled = true;
}