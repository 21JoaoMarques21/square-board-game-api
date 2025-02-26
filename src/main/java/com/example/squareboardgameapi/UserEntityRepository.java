package com.example.squareboardgameapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, UUID> {
    // No need to declare methods; JpaRepository provides basic CRUD operations
}
