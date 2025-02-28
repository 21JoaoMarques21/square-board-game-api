package com.example.squareboardgameapi;

public class UserCreationParams {
    private final String email;
    private String password;

    public UserCreationParams(String email) {
        this.email = email;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
