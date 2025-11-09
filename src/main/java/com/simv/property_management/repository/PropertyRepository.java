package com.simv.property_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.simv.property_management.entity.PropertyEntity;

public interface PropertyRepository extends JpaRepository<PropertyEntity, Long> {

    //@Query("SELECT p FROM PropertyEntity p WHERE p.userEntity.id = :userId AND p.title = :title")
    //List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId, @Param("title") Long title);
    List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId);
}
