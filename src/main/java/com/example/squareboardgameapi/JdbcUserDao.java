package com.example.squareboardgameapi;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository  // Marks the class as a Spring-managed bean
@Primary
public abstract class JdbcUserDao implements UserDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    // Constructor injection of NamedParameterJdbcTemplate
    public JdbcUserDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User save(User user) {
        String sql = "INSERT INTO users (user_id, email, password) VALUES (:userId, :email, :password)";

        // Map parameters
        Map<String, Object> params = new HashMap<>();
        params.put("userId", user.getUserId());
        params.put("email", user.getEmail());
        params.put("password", user.getPassword());

        // Execute the insert query
        jdbcTemplate.update(sql, params);

        return user;
    }

    @Override
    public User findById(UUID userId) {
        String sql = "SELECT * FROM users WHERE user_id = :userId";

        // Map parameters
        Map<String, Object> params = new HashMap<>();
        params.put("userId", userId);

        // Execute the query and map the result to a User object
        return jdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
