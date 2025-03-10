package com.example.squareboardgameapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaUserDao implements UserDao {

    private final UserEntityRepository userEntityRepository;

    @Autowired
    public JpaUserDao(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = convertToUserEntity(user);
        userEntity = userEntityRepository.save(userEntity);
        return convertToUser(userEntity);
    }

    @Override
    public User findById(UUID userId) { // Ensure UUID is used
        Optional<UserEntity> userEntity = userEntityRepository.findById(userId);
        return userEntity.map(this::convertToUser).orElse(null);
    }

    private UserEntity convertToUserEntity(User user) {
        return new UserEntity(user.getUserId(), user.getEmail(), user.getPassword());
    }

    private User convertToUser(UserEntity userEntity) {
        return new User(userEntity.getUserId(), userEntity.getEmail(), userEntity.getPassword());
    }
}
