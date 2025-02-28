package com.example.squareboardgameapi;

import java.util.UUID;

public class User {
    private final UUID userId;  // Change Long to UUID
    private final String email;
    private String password;

    // Constructor for existing users
    public User(UUID userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public UUID getUserId() { return userId; }

    public String getEmail() { return email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
