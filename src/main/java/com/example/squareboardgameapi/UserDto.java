package com.example.squareboardgameapi;

import java.util.UUID;

public class UserDto {
    private UUID userId;
    private String email;

    // Constructor
    public UserDto(UUID userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    // Getters and Setters
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
