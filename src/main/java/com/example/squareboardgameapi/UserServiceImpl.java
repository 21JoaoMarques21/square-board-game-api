package com.example.squareboardgameapi;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    // Inject the UserDao into the service using constructor injection
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User createUser(String email, String password) {
        User newUser = new User(UUID.randomUUID(), email, password); // Use UUID instead of Long

        System.out.println("Attempting to save user: " + newUser);
        User savedUser = userDao.save(newUser);
        System.out.println("User saved successfully: " + savedUser);

        return savedUser;
    }

    @Override
    public User getUserById(UUID userId) {  // Change from Long to UUID
        return userDao.findById(userId);
    }
}
