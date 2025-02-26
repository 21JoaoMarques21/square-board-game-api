package com.example.squareboardgameapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Inject the UserService into the controller
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // POST /users: Create a new user
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserCreationParams userCreationParams) {
        // Call the service to create the user
        User newUser = userService.createUser(userCreationParams.getEmail(), userCreationParams.getPassword());

        // Return the UserDto (excluding the password)
        return new UserDto(newUser.getUserId(), newUser.getEmail());
    }

    // GET /users/{id}: Get a user by ID
    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable UUID id) {
        // Call the service to get the user
        User user = userService.getUserById(id);

        if (user == null) {
            throw new RuntimeException(id.toString()); // User not found, throw exception
        }

        // Return the UserDto (excluding the password)
        return new UserDto(user.getUserId(), user.getEmail());
    }

    // Custom exception to handle user not found scenario
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFound(UserNotFoundException exception) {
        return "User with ID " + exception.getUserId() + " not found.";
    }

    // Custom exception class
    public static class UserNotFoundException extends RuntimeException {
        private final Long userId;

        public UserNotFoundException(Long userId) {
            super("User not found");
            this.userId = userId;
        }

        public Long getUserId() {
            return userId;
        }
    }
}
