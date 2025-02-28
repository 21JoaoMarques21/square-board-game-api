package com.example.squareboardgameapi;

import java.util.UUID;

public interface UserDao {
    User save(User user);
    User findById(UUID userId);  // Change from Long to UUID
}
