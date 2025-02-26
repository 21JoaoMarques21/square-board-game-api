package com.example.squareboardgameapi;

import java.util.UUID;

public interface UserService {
    User createUser(String email, String password);
    User getUserById(UUID userId); // Change Long to UUID
}
