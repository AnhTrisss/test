package com.jewelry_store.jewelry_store.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.jewelry_store.jewelry_store.entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Authenticate user
    Optional<User> findByUserNameAndPassword(String username, String password);

    // Retrieve a user by their username
    User findByName(String username);
}

