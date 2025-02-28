package com.example.squareboardgameapi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UserEntity {
    @Id
    private UUID userId;  // UUID as Primary Key
    private String email;
    private String password;

    public UserEntity() {}  // Default constructor for JPA

    public UserEntity(UUID userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public UUID getUserId() { return userId; }

    public String getEmail() { return email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
