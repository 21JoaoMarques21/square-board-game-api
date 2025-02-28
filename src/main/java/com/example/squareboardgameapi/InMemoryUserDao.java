package com.example.squareboardgameapi;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository  // Use @Repository to indicate that this is a DAO bean
public class InMemoryUserDao implements UserDao {

    private static final Map<UUID, User> userDatabase = new HashMap<>();  // In-memory user storage

    @Override
    public User save(User user) {
        userDatabase.put(user.getUserId(), user);  // Save the user to the in-memory collection
        return user;  // Return the saved user
    }

    @Override
    public User findById(UUID userId) {
        return userDatabase.get(userId);  // Retrieve the user by their ID
    }

}
