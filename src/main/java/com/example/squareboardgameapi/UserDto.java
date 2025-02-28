package com.example.squareboardgameapi;

import java.util.UUID;

public class UserDto {
    private final UUID userId;
    private final String email;

    // Constructor
    public UserDto(UUID userId, String email) {
        this.userId = userId;
        this.email = email;
    }

}
