package com.simv.property_management.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simv.property_management.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByOwnerEmailAndPassword(String email, String password);
    Optional<UserEntity> findByOwnerEmail(String email);
}
