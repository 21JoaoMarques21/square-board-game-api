package com.example.squareboardgameapi;

import java.util.UUID;

public class User {
    private UUID userId;  // Change Long to UUID
    private String email;
    private String password;

    // Constructor for new users (UUID auto-generated)
    public User(String email, String password) {
        this.userId = UUID.randomUUID();  // Generate new UUID
        this.email = email;
        this.password = password;
    }

    // Constructor for existing users
    public User(UUID userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
